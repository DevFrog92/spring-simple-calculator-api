# Simple Calculation api project

## 프로젝트 개요
간단한 사칙연산을 제공하는 API 서비스

## 프로젝트 기능 정의
간단한 사칙연산이 가능하다. 
각각의 연산은 `java`의 `long`데이터타입의 범위인 `-9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807` 범위 이내의 연산만 가능하다. <br/>
나눗셈의 경우, 분모가 0인 연산은 수행할 수 없고 `NotDividedByZeroException`예외가 발생한다.
<br/>

### 사칙연산 기능
```text
POST: /api/calc
```
- 덧셈
  ```json
    
    //request
    {
        "operand1": "1",
        "operand2": "2",
        "operator": "+"
    }
  ```
  ```json
    // response
    {
      "statusCode": 200,
      "message": "성공적으로 계산되었습니다.",
      "body": {
        "result": "3",
        "operand1": "1",
        "operand2": "2",
        "operator": "+"
      }
    }
  ```
- 뺄샘
  ```json
    
    //request
    {
        "operand1": "1",
        "operand2": "2",
        "operator": "-"
    }
  ```
  ```json
    // response
    {
      "statusCode": 200,
      "message": "성공적으로 계산되었습니다.",
      "body": {
        "result": "-1",
        "operand1": "1",
        "operand2": "2",
        "operator": "+"
      }
    }
  ```
- 곱셈
  ```json
    
    //request
    {
        "operand1": "1",
        "operand2": "2",
        "operator": "*"
    }
  ```
  ```json
    // response
    {
      "statusCode": 200,
      "message": "성공적으로 계산되었습니다.",
      "body": {
        "result": "2",
        "operand1": "1",
        "operand2": "2",
        "operator": "*"
      }
    }
  ```
- 나눗셈
    ```json
        
        //request
        {
            "operand1": "1",
            "operand2": "2",
            "operator": "/"
        }
    ```
    ```json
        // response - success
        {
          "statusCode": 200,
          "message": "성공적으로 계산되었습니다.",
          "body": {
            "result": "0.5",
            "operand1": "1",
            "operand2": "2",
            "operator": "/"
          }
        }
    ```
    ```json
        
        //request - divided by zero
        {
            "operand1": "2",
            "operand2": "0",
            "operator": "/"
        }
    ```

    ```json
        // response - exception
        {
            "statusCode": 400,
            "message": "0으로 나눌 수 없습니다.",
            "body": {
                "operand2": "0으로 나눌 수 없습니다."
            }
        }
    ```
- 제곱
  ```json
    
    //request
    {
        "operand1": "2",
        "operand2": "2",
        "operator": "^"
    }
  ```
  ```json
    // response
    {
      "statusCode": 200,
      "message": "성공적으로 계산되었습니다.",
      "body": {
        "result": "4",
        "operand1": "2",
        "operand2": "2",
        "operator": "^"
      }
    }
  ```

## Tech Stack

<div align=center>
  <img src="https://img.shields.io/badge/java-007396?style=for-the-badge&logo=java&logoColor=white">
  <img src="https://img.shields.io/badge/spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white">
  <img src="https://img.shields.io/badge/git-F05032?style=for-the-badge&logo=git&logoColor=white">
  <img height="30" src="https://img.shields.io/badge/GitHub-black?style=flat-square&logo=GitHub&logoColor=white"/>
</div>
