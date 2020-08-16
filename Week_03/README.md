### 递归

###＃ Mindset

- 不要人肉进行递归（最大误区）
- 找到最近最简方法，将其拆解成可重复的问题
- 可采用数学归纳法思维

```java
/*
Recursion template of Java
*/
public void recur(int level, int param) { 
  // terminator 
  if (level > MAX_LEVEL) { 
    // process result 
    return; 
  }
  // process current logic 
  process(level, param); 
  // drill down 
  recur( level: level + 1, newParam); 
  // restore current status 
 
}

```
