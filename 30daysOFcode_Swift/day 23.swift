    var collection:[String] = [String]()
    var queue = Array<Node>()
    queue.append(root!)
    while queue.count > 0 {
        let current:Node = queue.removeFirst()
        collection.append(String(current.data))
            if (current.left != nil) {
                queue.append(current.left!)
            }
            if (current.right != nil) {
                queue.append(current.right!)
            }
        }
    print(collection.joinWithSeparator(" "))
