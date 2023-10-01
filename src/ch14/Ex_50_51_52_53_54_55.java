package ch14;
// 50~55 스트림의 그룹화와 분할에 대한
public class Ex_50_51_52_53_54_55 {
    public static void main(String[] args) {
        // 50. 스트림의 그룹화와 분할
        // ▶ partitioningBy()는 스트림을 2분할한다.
        // ex)
        // Collection partitioningBy(Predicate predicate)
        // Collection partitioningBy(Predicate predicate, Collector downstream)

        // ▶ groupingBy() 는 스트림을 n분할 한다.
        // Collector groupingBy(Function classifier)
        // Collector groupingBy(Function classifier, Collector downstream)
        // Collector groupingBy(Function classifier, Supplier mapFactory, Collector downstream)


        // 51. 스트림의 분할 - partitioningBy()
        // ▶ 스트림의 요소를 2분할
        // ex)
        // Collector partitioningBy(Predicate predicate)
        // Collector partitioningBy(Predicate predicate, Collector downstream)

        // Map<Boolean, List<Student>> stuBySex = stuStream
        //          .collect(partitioningBy(Student::isMale));  // 학생들을 성별로 분할
        // List<Student> maleStudent = stuBySex.get(true);      // Map에서 남학생 목록을 얻는다.
        // List<Student> femaleStudent = stuBySex.get(false);   // Map에서 여학생 목록을 얻는다.

        // Map<Boolean, Long> stuNameBySex = stuStream
        //          .collect(partitioningBy(Student::isMale, collects.counting()));  //  분할 + 통계
        // System.out.println("남학생 수 :" + stuNumBySex.get(true));   // 남학생 수 : 8
        // System.out.println("여학생 수 :" + stuNumBySex.get(false));   // 여학생 수 : 10

        // Map<Boolean, Optional<Student>> topScoreBySex = stuStream        //  분할 + 통계
        //  .collect(partitioningBy(Student::isMale. maxBy(comparingInt(Student::getScore))));
        // System.out.println("남학생 1등 :" + topScoreBySex.get(true));   // 남학생 1등 : optional [[나자바, 남 , 1 ,1 ,300]]
        // System.out.println("여학생 1등 :" + topScoreBySex.get(false));   // 여학생 1등 : optional [[김지미, 여 , 1 ,1 ,250]]

        // Map<Boolean, Map<Boolean, List<Student>>> failedStuBySex = stuStream     // 다중 분할
        // .collect(partitioningBy(Student::isMaile,            // 1. 성별로 분할 (남/여)
        //          partitioningBy(s -> s.getScore() < 150)));  // 2. 성적으로 분할 (불합격/합격)
        // List<Student> failedMaleStu  = failedStuBySex.get(true).get(true);
        // List<Student> failedFemaleStu  = failedStuBySex.get(false).get(true);

        // 53. 스트림의 그룹화 - groupingBy()
        // ▶ 스트림의 요소를 그룹화
        // ex)
        // Collector groupingBy(Function classifier)
        // Collector groupingBy(Function classifier, Collector downstream)
        // Collector groupingBy(Function classifier, Supplier mapFactory,Collector downstream)

        // Map<Integer, List<Student>> stuByBan = stuStream     // 학생을 반별로 그룹화
        //  .collect(groupingBy(Student::getBan, toList()));    // toList() 생략가능

        // Map<Integer, Map<Intger, List<Student>>> stuByHakAndBan = stuStream      // 다중 그룹화
        //      .collect(groupingBy(Student::getHak,                                // 1. 학년별 그룹화
        //               groupingBy(student::getBan)                                // 2, 반별 그룹화
        //      ));

        // Map<Integer, Map<Integer, Set<Student.Leve1>>> stuByHakAndBan = stuStream
        //  .collect(
        //          groupingBy(Student::getHak, groupingBy(Student::getBan,     // 다중 그룹화(학년별, 반별)
        //              mapping(s-> { // 성적등급(Level)으로 변환. List<Student> - > Set<Student.Leve1>
        //              if      (s.getScore() >= 200) return Student.Leve1.HIGH;
        //              else if (s.getScore() >= 100) return Student.Leve1.MID;
        //              else                          return Student.Leve1.LOW;
        //          }, toSet()) // mapping()            // enum Leve1 { HIGH, MID, LOW }
        //      ))  // groupingBy()
        //  ); // collect()

        // ※ 55. 스트림의 변환 표 참고 할것!!!


    }
}
