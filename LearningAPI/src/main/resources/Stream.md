
1. Stream 概述
2. Stream 的创建
3. Stream 的使用
3.1. 案例使用的员工类
3.2. 遍历/匹配（foreach/find/match）
3.3. 筛选（filter）
3.4. 聚合（max/min/count)
3.5. 映射(map/flatMap)
3.6. 归约(reduce)
3.7. 收集(collect)
3.8. 排序(sorted)
3.9. 提取/组合
4. 最新资料

1. Stream 概述
Java 8 是一个非常成功的版本，这个版本新增的Stream，配合同版本出现的 Lambda ，给我们操作集合（Collection）提供了极大的便利。
那么什么是Stream？
Stream将要处理的元素集合看作一种流，在流的过程中，借助Stream API对流中的元素进行操作，比如：筛选、排序、聚合等。
Stream可以由数组或集合创建，对流的操作分为两种：
中间操作，每次返回一个新的流，可以有多个。
终端操作，每个流只能进行一次终端操作，终端操作结束后流无法再次使用。终端操作会产生一个新的集合或值。
另外，Stream有几个特性：
stream 不存储数据，而是按照特定的规则对数据进行计算，一般会输出结果。
stream 不会改变数据源，通常情况下会产生一个新的集合或一个值。
stream 具有延迟执行特性，只有调用终端操作时，中间操作才会执行。

2. Stream 的创建
stream和parallelStream的简单区分： stream是顺序流，由主线程按顺序对流执行操作，而parallelStream是并行流，内部以多线程并行执行的方式对流进行操作，但前提是流中的数据处理没有顺序要求。例如筛选集合中的奇数，两者的处理不同之处：

如果流中的数据量足够大，并行流可以加快处速度。
除了直接创建并行流，还可以通过parallel()把顺序流转换成并行流：
Optional<Integer> findFirst = list.stream().parallel().filter(x->x>6).findFirst();

3. Stream 的使用
Optional类是一个可以为null的容器对象。如果值存在则isPresent()方法会返回true，调用get()方法会返回该对象。

3.5. 映射(map/flatMap)
映射，可以将一个流的元素按照一定的映射规则映射到另一个流中。分为map和flatMap：
map：接收一个函数作为参数，该函数会被应用到每个元素上，并将其映射成一个新的元素。
flatMap：接收一个函数作为参数，将流中的每个值都换成另一个流，然后把所有流连接成一个流。
3.6. 归约(reduce)
归约，也称缩减，顾名思义，是把一个流缩减成一个值，能实现对集合求和、求乘积和求最值操作。
3.7. 收集(collect)
Collectors提供了一系列用于数据统计的静态方法：
计数：count
平均值：averagingInt、averagingLong、averagingDouble
最值：maxBy、minBy
求和：summingInt、summingLong、summingDouble
统计以上所有：summarizingInt、summarizingLong、summarizingDouble
3.7.3 分组(partitioningBy/groupingBy)
分区：将stream按条件分为两个Map，比如员工按薪资是否高于 8000 分为两部分。
分组：将集合分为多个 Map，比如员工按性别分组。有单级分组和多级分组。
3.7.4 接合(joining)
joining可以将 stream 中的元素用特定的连接符（没有的话，则直接连接）连接成一个字符串。
3.7.5 归约(reducing)
Collectors类提供的reducing方法，相比于stream本身的reduce方法，增加了对自定义归约的支持。
3.8. 排序(sorted)
sorted，中间操作。有两种排序：
sorted()：自然排序，流中元素需实现 Comparable 接口
sorted(Comparator com)：Comparator 排序器自定义排序
3.9. 提取/组合
流也可以进行合并、去重、限制、跳过等操作。

~~``~~