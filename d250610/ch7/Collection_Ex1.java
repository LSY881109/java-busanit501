package d250610.ch7;

import java.util.ArrayList;

public class Collection_Ex1 {
    // Collection 프레임워크의 구조 (인터페이스 와 클래스 구현 관계)
    // Collection 인터페이스의 구현체 (List, Set, Map) 의 차이

    // 기본 개념
    // Collection 프레임워크 :
    // 데이터를 효율적으로 저장, 검색, 수정, 삭제 할수 있게 해주는 표준화된 클래스 집합.
    // 인터페이스 : Collection, List, Set, Map
    // 구현 클래스 : ArrayList, HashSet, HashMap, 등
    // List : 순서 O, 중복 O, 예) ArrayList
    // Set : 순서 X, 중복 X, 예) HashSet
    // Map : 데이터 형태 , 키-값 형태 , 키 중복 X, 예) HashMap

    public static void main(String[] args) {
        // List 예시, ArrayList , 배열의 업그레이드 버전, 크기 가변.
        // A a = new A(); , A: 클래스명
        // <> 다이어몬드 연산자, 제너릭으로 표현하는데, 쉽게, 저는 여기 <String> 타입만 취급함.
        ArrayList<String> list = new ArrayList<>();
        // 리스트에 추가
        list.add("사과");
        list.add("바나나");
        // 리스트에 하나씩 조회
        System.out.println("첫번째 요소 : " + list.get(0));
        System.out.println("두번째 요소 : " + list.get(1));
        // 반복문으로 전체 조회
        for (String string : list) {
            System.out.println("list 요소 전체 반복문으로 출력 해보기 : " + string);
        }
    }
}
