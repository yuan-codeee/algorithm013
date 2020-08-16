### Ｍindset
做题四步曲：
- clarification
- possible solutinos -> optimal (time & space)
- code
- test cases


### 树

Linked list 可看成是特殊化的 tree (tree 用升维来加块了 next 的速度);
而　tree 可以看成是特殊化的　graph (tree 没有环路)

#### 二叉树的遍历

1. 前序 (pre-order): 中－左－右
２．中序 (in-order): 左－中－右
3. 后序 (post-order): 左－右－中

**Note:** BST 里中序遍历的值是递增的、


### 二叉堆

１．二叉堆一般都通过数组来实现
２．假设第一个元素在数组中的索引为０的话，则父节点和子节点的位置关系如下：
- 索引为 i 的左孩子的索引为　`(2 * i + 1)`
- 索引为　i 的右孩子的索引为　`(2 * i + 2)`
- 索引为　i 的父节点的索引为　`floor((i - 1) / 2)`

#### 插入操作　(HeapifyUp)
1. 新元素一律先插入到堆的尾部（即一维数组的尾部）
２．依次向上调整整个堆的结构（一直到根即可）


#### 删除堆顶操作　(HeapfiDown)
1. 将堆尾元素替换到顶部（即堆顶被替代删除）
２．依次从根部向下调整整个堆的结构（一直到堆尾即可）