class Solution {
  minimum_index(seq: Array<number>): number {
    if (seq.length == 0) {
      throw new Error(
        "Cannot get the minimum value index from an empty sequence"
      );
    }
    let min_idx: number = 0;
    for (let i = 1; i < seq.length; ++i) {
      if (seq[i] < seq[min_idx]) {
        min_idx = i;
      }
    }
    return min_idx;
  }

  static TestDataEmptyArray = class {
    get_array(): Array<number> {
      var A: Array<number> = [];
      return A;
    }
  };

  static TestDataUniqueValues = class {
    get_array(): Array<number> {
      var A: Array<number> = [1, 2, 3];
      return A;
    }

    get_expected_result(): number {
      return 0;
    }
  };

  static TestDataExactlyTwoDifferentMinimums = class {
    get_array(): Array<number> {
      var A: Array<number> = [1, 1, 2, 3];
      return A;
    }

    get_expected_result(): number {
      return 0;
    }
  };
}

var sol1 = new Solution();
var sol2 = new Solution().minimum_index([]);
var sol3 = new Solution.TestDataEmptyArray();
