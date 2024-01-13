package blair_2024.week_02;

public class Daily0109 {

    // 04-4 퀵 정렬

    // k번째 수 구하기
    // https://www.acmicpc.net/problem/11004

    /*
        ❗️문제 분석하기

        - 퀵 정렬을 구현해 주어진 수를 오름차순으로 정렬한 뒤, k번째 수 출력
        - 퀵 정렬 알고리즘에서 K번쨰 수를 좀 더 빨리 구하기 위한 아이디어 고민
        - 퀵 정렬 알고리즘을 구현하려면 먼저 pivot을 지정해야 함
        - 어떤 값을 pivot으로 정하면 k번째 수를 더 빨리 구할 수 있을까?! 고민
        - pivot 정하는 방법
            ㄴ pivot == K: K번째 수를 찾은 것이므로 알고리즘을 종료한다.
            ㄴ pivot > K: pivot의 왼쪽 부분에 K가 있으므로 왼쪽(S ~ pivot -1)만 정렬을 수행한다.
            ㄴ pivot < K: pivot의 오른쪽 부분에 K가 있으므로 오른쪽(pivot + 1 ~ E)만 정렬을 수행한다.
        - 데이터가 대부분 정렬되어 있는 경우 앞쪽에 있는 수를 pivot으로 선택하면 불필요한 연산이 많아짐
        - 이 문제의 경우 배열의 중간 위치를 pivot으로 설정하고 접근
     */

}
