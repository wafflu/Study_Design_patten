### Observer

1. 상태를 전달하는 역할이 크다
2. 1:M 의 의존성을 가지고 있다

### 옵저버 패턴 흐름



출처: https://inpa.tistory.com/entry/GOF-💠-옵저버Observer-패턴-제대로-배워보자 [Inpa Dev 👨‍💻:티스토리]

### Observer의 행위가 Subject에 영향을 미칠 때
멀티스레딩 환경에서는 상태 변경을 통지하는 과정에서 동기화 문제를 고려해야 한다
그렇지 않으면 데이터 경쟁(race condition)이나 일관성 문제가 발생

- 해결법
  1. synchronized 키워드를 사용하여 동기화
  2. ReentrantLock 사용
  
잠금의 필요성
1.	데이터 경쟁 방지: 여러 스레드가 동시에 상태를 변경하거나 관찰자 목록을 수정할 때 발생하는 문제를 방지합니다.
2.	일관성 유지: 상태 변경과 관찰자 통지가 일관성 있게 수행되도록 보장합니다.
3.	안정성 향상: 예기치 않은 동작이나 충돌을 방지하여 시스템의 안정성을 높입니다.


### 갱신을 위한 힌트정보 다루기
정보 갱신을위해 update메소드를 사용하게 되는데 이때

update는 정보갱신을 다루는 역할에 집중을 하기위해 Observer가 Subject의 구체적인 처리 내용을 의식하지 않도록 디자인하는 것이 좋다
update 메서드의 인자를 최소화하고, 필요할 경우 Subject로부터 필요한 데이터를 간접적으로 요청하는 방식으로 설계할 수 있습니다.