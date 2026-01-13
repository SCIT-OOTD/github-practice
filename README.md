# 🧮 Java 계산기 - GitHub 협업 연습 프로젝트

## 📋 프로젝트 개요

이 프로젝트는 **GitHub 협업 프로그래밍 연습**을 위한 샘플 프로젝트입니다.  
팀원 4명이 각각 계산기의 한 가지 기능을 담당하여 구현하고, Git/GitHub를 통해 협업하는 과정을 연습합니다.

---

## 👥 팀 구성 및 역할 분배

| 팀원 | 담당 기능 | 브랜치명 | 구현 파일 |
|------|----------|---------|----------|
| **팀원 A** | ➕ 더하기 (Add) | `feat/add` | `Add.java` |
| **팀원 B** | ➖ 빼기 (Subtract) | `feat/subtract` | `Subtract.java` |
| **팀원 C** | ✖️ 곱하기 (Multiply) | `feat/multiply` | `Multiply.java` |
| **팀원 D** | ➗ 나누기 (Divide) | `feat/divide` | `Divide.java` |
| **팀장** | 🔧 메인 로직 통합 | `main` | `Calculator.java`, `Main.java` |

---

## 📁 프로젝트 구조

```
github-practice/
├── src/
│   └── calculator/
│       ├── Main.java           # 메인 실행 클래스 (팀장)
│       ├── Calculator.java     # 계산기 통합 클래스 (팀장)
│       ├── Add.java            # 더하기 기능 (팀원 A)
│       ├── Subtract.java       # 빼기 기능 (팀원 B)
│       ├── Multiply.java       # 곱하기 기능 (팀원 C)
│       └── Divide.java         # 나누기 기능 (팀원 D)
├── README.md
├── CONTRIBUTING.md
└── .github/
    └── PULL_REQUEST_TEMPLATE.md
```

---

## 🚀 협업 워크플로우 가이드

### Step 1: 저장소 Clone
```bash
# 팀원 모두 저장소를 로컬에 복제합니다
git clone https://github.com/SCIT-OOTD/github-practice.git
cd github-practice
```

### Step 2: 기능 브랜치 생성 (각 팀원)
```bash
# 예: 팀원 A의 경우 (더하기 기능)
git checkout -b feat/add

# 팀원 B의 경우 (빼기 기능)
git checkout -b feat/subtract

# 팀원 C의 경우 (곱하기 기능)
git checkout -b feat/multiply

# 팀원 D의 경우 (나누기 기능)
git checkout -b feat/divide
```

### Step 3: 코드 작성 및 커밋
```bash
# 코드 작성 후 스테이징
git add src/calculator/Add.java

# 커밋 (Angular 컨벤션 준수)
git commit -m "Feat: 더하기 기능 구현"
```

### Step 4: 원격 저장소에 Push
```bash
# 브랜치를 원격에 업로드
git push origin feat/add
```

### Step 5: Pull Request 생성
1. GitHub 웹사이트에서 **"Compare & pull request"** 버튼 클릭
2. PR 템플릿에 맞춰 내용 작성
3. 리뷰어(팀장 또는 다른 팀원) 지정
4. PR 생성 후 코드 리뷰 대기

### Step 6: 코드 리뷰 및 머지
```bash
# 팀장: 로컬에서 최신 main 가져오기
git checkout main
git pull origin main

# PR이 승인되면 GitHub에서 Merge 또는 로컬에서:
git merge feat/add
git push origin main
```

---

## 💻 각 팀원별 구현 가이드

### 팀원 A: Add.java (더하기)
```java
package calculator;

public class Add {
    public static double execute(double a, double b) {
        return a + b;
    }
}
```

### 팀원 B: Subtract.java (빼기)
```java
package calculator;

public class Subtract {
    public static double execute(double a, double b) {
        return a - b;
    }
}
```

### 팀원 C: Multiply.java (곱하기)
```java
package calculator;

public class Multiply {
    public static double execute(double a, double b) {
        return a * b;
    }
}
```

### 팀원 D: Divide.java (나누기)
```java
package calculator;

public class Divide {
    public static double execute(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("0으로 나눌 수 없습니다.");
        }
        return a / b;
    }
}
```

---

## 🔄 Git 명령어 정리

| 명령어 | 설명 |
|--------|------|
| `git clone <url>` | 원격 저장소 복제 |
| `git checkout -b <branch>` | 새 브랜치 생성 및 이동 |
| `git add <file>` | 변경 파일 스테이징 |
| `git commit -m "<message>"` | 커밋 생성 |
| `git push origin <branch>` | 원격에 브랜치 업로드 |
| `git pull origin <branch>` | 원격 변경사항 가져오기 |
| `git merge <branch>` | 브랜치 병합 |
| `git status` | 현재 상태 확인 |
| `git log --oneline` | 커밋 히스토리 확인 |
| `git branch` | 브랜치 목록 확인 |
| `git branch -d <branch>` | 브랜치 삭제 |

---

## ⚠️ 충돌 해결 가이드

### 충돌 발생 시 처리 순서
```bash
# 1. 최신 main 브랜치 가져오기
git checkout main
git pull origin main

# 2. 내 브랜치로 돌아가기
git checkout feat/add

# 3. main을 내 브랜치에 병합 (충돌 발생 가능)
git merge main

# 4. 충돌 파일 수정 후
git add .
git commit -m "Fix: main 브랜치와 충돌 해결"

# 5. 다시 Push
git push origin feat/add
```

### 충돌 마커 이해하기
```
<<<<<<< HEAD
내 코드
=======
다른 사람의 코드
>>>>>>> main
```
- `<<<<<<< HEAD`: 현재 브랜치의 코드 시작
- `=======`: 구분선
- `>>>>>>> main`: 병합하려는 브랜치의 코드 끝

---

## 📝 커밋 메시지 컨벤션

```
Type: Subject

Body (선택사항)
```

### Type 종류
- `Feat`: 새로운 기능 추가
- `Fix`: 버그 수정
- `Docs`: 문서 수정
- `Refactor`: 코드 리팩토링
- `Test`: 테스트 코드 추가

### 예시
```bash
git commit -m "Feat: 더하기 기능 구현"
git commit -m "Fix: 0으로 나누기 예외 처리 추가"
git commit -m "Docs: README 업데이트"
```

---

## ✅ 체크리스트

- [ ] 저장소 Clone 완료
- [ ] 담당 기능 브랜치 생성
- [ ] Java 코드 작성
- [ ] 커밋 컨벤션에 맞게 커밋
- [ ] 원격 저장소에 Push
- [ ] Pull Request 생성
- [ ] 코드 리뷰 완료
- [ ] Main 브랜치에 Merge

---

## 📚 참고 자료

- [Git 공식 문서](https://git-scm.com/doc)
- [GitHub Flow 가이드](https://guides.github.com/introduction/flow/)
- [커밋 컨벤션 상세 가이드](./CONTRIBUTING.md)

---

## 🎯 학습 목표

1. **브랜치 전략** 이해 및 실습
2. **Pull Request** 생성 및 코드 리뷰 경험
3. **충돌 해결** 방법 익히기
4. **커밋 컨벤션** 습관화
5. **팀 협업** 워크플로우 체득

---

> 💡 **Tip**: 각 팀원은 자신의 기능을 구현하기 전에 반드시 `main` 브랜치에서 최신 코드를 `pull` 받은 후 작업을 시작하세요!
