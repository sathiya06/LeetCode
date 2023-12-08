class Solution(object):
    def tree2str(self, root):
      ans = []
      self.helper(root, ans)
      return ''.join(ans)
    
    def helper(self, root, ans):
      if root is None:
        return
      ans.append(str(root.val))
      if root.left is None and root.right is None:
        return
      ans.append('(')
      self.helper(root.left, ans)
      ans.append(')')
      if root.right is not None:
        ans.append('(')
        self.helper(root.right, ans)
        ans.append(')')
       