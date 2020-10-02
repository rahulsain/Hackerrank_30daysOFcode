#include <iostream>
#include <queue>
#include <stack>
#include <vector>
using namespace std;

class Solution {
  public:
    
    void pushCharacter(const char c_) { _s.push(c_); }
    void enqueueCharacter(const char c_) { _q.push(c_); }
    char popCharacter() {
        char c = _s.top();
        _s.pop();
        return c;
    }
    char dequeueCharacter() {
        char c = _q.front();
        _q.pop();
        return c;
    }
  private:
    queue<char> _q;
    stack<char> _s;
};

int main() {
    // reading the string without using getline function
    char c,last=0;
    string s;
    while(cin.get(c)){  // read one character at a time
      if(last && (isalpha(last) || (isalpha(last) && isalpha(c))))
         s.push_back(last);
      last=c;   
     }
    
    Solution obj;

    for (int i = 0; i < s.length(); i++) {
        obj.pushCharacter(s[i]);
        obj.enqueueCharacter(s[i]);
    }

    bool isPalindrome = true;

    
    for (int i = 0; i < s.length() / 2; i++) {
        if (obj.popCharacter() != obj.dequeueCharacter()) {
            isPalindrome = false;

            break;
        }
    }

  
    if (isPalindrome) {
        cout << "The word, " << s << ", is a palindrome.";
    } else {
        cout << "The word, " << s << ", is not a palindrome.";
    }

    return 0;
}
