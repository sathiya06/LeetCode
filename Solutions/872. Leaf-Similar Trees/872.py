class Solution:
    def leafSimilar(self, root1: Optional[TreeNode], root2: Optional[TreeNode]) -> bool:
        arr1 = []
        arr2 = []
        self.getLeaf(root1, arr1)
        self.getLeaf(root2, arr2)
        if len(arr1) != len(arr2):
            return False
        for i in range(len(arr1)):
            if arr1[i] != arr2[i]:
                return False
        return True

    def getLeaf(self, root: Optional[TreeNode], arr: List[int]):
        if root is None:
            return
        if root.left is None and root.right is None:
            arr.append(root.val)
        self.getLeaf(root.left, arr)
        self.getLeaf(root.right, arr)
        