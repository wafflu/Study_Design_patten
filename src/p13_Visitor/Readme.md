### Visitor

목적 : 데이터의 처리와 데이터 구조를 분리하는 것
객체 구조를 수정하지 않고도 새로운 작업을 추가하거나 객체 구조를 순회하는 방법을 변경가능

OCP 원칙이 잘 적용되어 있다

ConcreteVisitor 역할 추가는 쉽다 = 데이터 처리 역할을 맡은부분만 새로추가

단점
ConcreateElement 역할 추가시에는
visitor클래스에 메서드를 만들고 visitor클래스의 하위 클래스 에서도 추가 해주어야한다

방문자는 데이터 구조에서 필요한 정보를 취득하여 동작

문제점: 공개하지 말아야 할 정보의 노출

방문자 패턴의 단점 중 하나는 객체 구조의 요소들이 방문자를 받아들이기 위해 내부 정보를 공개해야 할 수도 있다는 점입니다. 이는 다음과 같은 문제를 일으킬 수 있습니다:

1.	캡슐화의 약화: 객체의 내부 상태나 세부 구현이 외부에 노출되면, 객체지향 설계의 기본 원칙 중 하나인 캡슐화가 약화됩니다. 이는 유지보수성에 부정적인 영향을 미칠 수 있습니다.
미래의 데이터 구조 개선 어려움: 객체 구조가 외부에 노출된 상태에서는 내부 구조를 변경하기 어렵습니다. 이는 다음과 같은 이유로 인해 발생합니다:
	•	방문자가 객체 구조의 내부 구현에 의존하게 되므로, 객체 구조를 변경할 때 방문자도 함께 수정해야 합니다.
	•	내부 정보를 노출하지 않는 설계를 유지하려면 객체 구조와 방문자 간의 강한 결합을 피해야 하지만, 방문자 패턴에서는 이를 피하기 어렵습니다.