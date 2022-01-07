开发tips
1. 删除多余的异常捕获并抛出
2、删除未使用的局部变量、方法参数、私有方法、字段和多余的括号。

3. 字符串转化使用String.valueOf(value) 代替 " " + value
4. 避免使用BigDecimal(double)  // BigDecimal bigDecimal1 = bigDecimal.valueOf(0.11D);
5. 返回空数组和集合而非 null

//返回空数组和空集正例
public static Result[] getResults() {
    return new Result[0];
}

public static List<Result> getResultList() {
    return Collections.emptyList();
}

public static Map<String, Result> getResultMap() {
    return Collections.emptyMap();
}

6. 优先使用常量或确定值调用equals 方法


//调用 equals 方法正例
private static boolean fileReader(String fileName)throws IOException{

    // 使用常量或确定有值的对象来调用 equals 方法
    return "Charming".equals(fileName);
    
    //或使用：java.util.Objects.equals() 方法
   return Objects.equals("Charming",fileName);
 }
 
7. 枚举的属性字段必须是私有且不可变
 
 
public enum SwitchStatus {
    // 枚举的属性字段正例
    DISABLED(0, "禁用"),
    ENABLED(1, "启用");

    // final 修饰
    private final int value;
    private final String description;

    private SwitchStatus(int value, String description) {
        this.value = value;
        this.description = description;
    }

    // 没有Setter 方法
    public int getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }
}

8. string.split(String regex)部分关键字需要转译

// String.split(String regex) 正例
// . 需要转译
String[] split2 = "a.ab.abc".split("\\.");
System.out.println(Arrays.toString(split2));  // 结果为["a", "ab", "abc"]

// | 需要转译
String[] split3 = "a|ab|abc".split("\\|");
System.out.println(Arrays.toString(split3));  // 结果为["a", "ab", "abc"]

9. 工具类中屏蔽构造函数

10. 最好使用instanceof做一个类型检查，以判断是否可以进行强转 
   @Test
        public void test0()
        {
            Object a = 0;
            //最好使用instanceof做一个类型检查，以判断是否可以进行强转
            if (a instanceof String)
            {
                String b = (String) a;
                System.out.println(b);
            }
            else
            {
                System.out.println("error");
            }
        }
11. MyBatis 不要为了多个查询条件而写 1 = 1

12. 迭代entrySet() 获取Map 的key 和value

  //Map 获取key & value 正例:
HashMap<String, String> map = new HashMap<>();
 for (Map.Entry<String,String> entry : map.entrySet()){
     String key = entry.getKey();
     String value = entry.getValue();
}

13. 使用Collection.isEmpty() 检测空

14. 初始化集合时尽量指定其大小

15. 使用StringBuilder 拼接字符串

16. 若需频繁调用Collection.contains 方法则使用Set

//频繁调用Collection.contains() 正例
  List<Object> list = new ArrayList<>();
  Set<Object> set = new HashSet<>(list);
  for (int i = 0; i <= Integer.MAX_VALUE; i++){
      //时间复杂度为O(1)
      if (set.contains(i)){
          System.out.println("list contains "+ i);
      }
  }
  
17. 使用静态代码块实现赋值静态成员变量

    public class PasswordUtils
{
    //工具类构造函数正例
    private static final Logger LOG = LoggerFactory.getLogger(PasswordUtils.class);

    //定义私有构造函数来屏蔽这个隐式公有构造函数
    private PasswordUtils()
    {
    }

    public static final String DEFAULT_CRYPT_ALGO = "PBEWithMD5AndDES";

    public static String encryptPassword(String aPassword) throws IOException
    {
        return new PasswordUtils(aPassword).encrypt();
    }
}

18. 过时代码添加 @Deprecated 注解
19. 优化if-else代码的八种方案

