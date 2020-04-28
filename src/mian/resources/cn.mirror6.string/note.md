## 1.String是可变的吗？如果不是请说明原因。

>不可以。
>对于String来说，不可变有两个含义：
>1) 字符串长度不可变，这是由于底层是char[]数组决定的
>2) 字符串内容不可变，这是由于String类没有提供修改内容的方法导致的。

注意：反射可以修改String

## 2.String 类的常用方法都有哪些？

###查看长度
public int length()	     返回此字符串的长度
###转换功能
public byte[] getBytes()	    把字符串转换为字节数组

public char[] toCharArray()	把字符串转换为字符数组

public static String valueOf(char[] chs)	把字符数组转成字符串

public static String valueOf(int i)	把int类型的数据转成字符串  (valueOf方法可以把任意类型的  数据转成字符串)

public String toLowerCase()	把字符串转成小写

public String toUpperCase()	把字符串转成大写

public String concat(String str)	把字符串拼接
###替换功能
public String replace(char old, char new)	将指定字符进行互换

public String replace(String old, String new)	将指定字符进行互换
###去空格
public String trim()	去除两端空格
###分割功能
public String[] split(String regex)	分割字符串
###比较功能
public int compareTo(String str)	String的按字典顺序比较两个字符串

public int compareToIgnoreCase(String str)	忽略大小写比较字符串


## 3.如何将字符串反转？

1.将字符串转为char数组，然后从尾部开始遍历

2.使用StringBuffer或者StringBuilder的reverse方法
## 4.String、StringBuffer 和 StringBuilder 的区别？
String是字符串常量，创建之后不可以修改；
StringBuffer和StringBuilder是字符串变量，创建之后可以修改。
所以拼接字符串较多的场景下应该尽量使用Buffer和Builder，因为String更耗费内存。
StringBuffer和StringBuilder的区别主要是线程是否安全，前者线程安全，效率低下；后者线程不安全，效率较高。
二者的方法基本一样，不过Buffer的方法有synchronized关键字修饰。
如果不考虑线程安全的问题，建议使用Builder。

## 5.String s1 = "abc" 和 String s2 = new String("abc")的区别？

## 6.String s1=null;和String s2=" ";的区别？

前者是空对象，声明并进行初始化，但是引用没有进行指向，也没有申请内存资源。
本质上不是字符串，所以调用字符串的方法会出现空指针异常；
后者是空字符串，存在常量池中，可以调用字符串的方法。