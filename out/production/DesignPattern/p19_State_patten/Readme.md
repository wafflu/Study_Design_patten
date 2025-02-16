### State

상태를 클래스로 표현하다

상태를 클래스로 표현하면 클래스를 교체해서 ‘상태의 변화’를 표현할 수 있고, 객체 내부 상태 변경에 따라 객체의 행동을 상태에 특화된 행동들로 분리해 낼 수 있으며, 
새로운 행동을 추가하더라도 다른 행동에 영향을 주지 않는다.

* 상태 : 객체가 가질 수 있는 어떤 조건이나 상황을 의미한다.
* 상태는 그 객체의 현 폼을 나타내는 것이기 때문에 대부분의 상황에서 유일하게 있어야 한다.(Singleton 사용)

앞의 예제에서
Main에서 SafeFrame클래스의 setClock메소드를 호출하는데 SafeFrame에서의 setClock메서드는 state에게 위임

### 상태에 의존하는 처리
- 추상메소드로 선언하고 인터페이스로 한다
- 구상 메소드로 구현하고 개별 클래스로 한다

### 사용시기
- 객체의 행동(메서드)가 상태(state)에 따라 각기 다른 동작을 할때.
- 상태 및 전환에 걸쳐 대규모 조건 분기 코드와 중복 코드가 많을 경우
- 조건문의 각 분기를 별도의 클래스에 넣는것이 상태 패턴의 핵심
- 런타임단에서 객체의 상태를 유동적으로 변경해야 할때

### 장점
- 상태(State)에 따른 동작을 개별 클래스로 옮겨서 관리 할 수 있다.
- 상태(State)와 관련된 모든 동작을 각각의 상태 클래스에 분산시킴으로써, 코드 복잡도를 줄일 수 있다.

### 단점
- 상태 별로 클래스를 생성하므로, 관리해야할 클래스 수 증가
- 상태 클래스 갯수가 많고 상태 규칙이 자주 변경된다면, Context의 상태 변경 코드가 복잡해지게 될 수 있다.

상태를 추가하는것은 간단
인터페이스를 구현한 클래스를 만들고 필요한 메서드를 구현하면 되기 떄문이다.
하지만 환성된 State패턴에 새로운 '상태 의존 처리'를 추가하기는 어렵다
하위 모든 클래스에 처리를 추가해주어야 하기 때문이다 개발자의 실수로 까먹을수도 있어서...