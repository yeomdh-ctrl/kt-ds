var a = 1;
function addA() {
  var b = 2;
  a++;
  console.log(a);
}
addA();
console.log(a); // 2
console.log(b); // error

function print() {
  var num = 1;
  if (num > 0) {
    num = 2; // 2
  }
  console.log(num); // 1
}

window.onload = function () {
  //즉시 실행 함수란? -> 함수를 생성하자마자 스스로를 실행시키는 함수
  (function (number) {
    console.log("즉시 실행 함수 입니다.", number);
  })(100);

  var list = document.querySelector(".list");
  console.log(list); // 값 출력
  console.dir(list); // 값의 구조 출력
  console.log(list.dataset.count);

  var dataCount = parseInt(list.dataset.count);
  // .list에 dataCount의 수 만큼 li 태그를 생성한다.
  for (var i = 0; i < dataCount; i++) {
    (function (number) {
      // li 태그를 생성하고 내부 텍스트는 i + 1 한 값으로 세팅한다.
      var eachItem = document.createElement("li");
      eachItem.innerText = number;

      // 1. event parameter 받아와서 출력하기
      // 2. 즉시 실행 함수 이용해서 출력하기
      eachItem.addEventListener("click", function () {
        alert(number);
      });
      // 생성된 li 태그를 .list에 추가한다.
      list.appendChild(eachItem);
    })(i + 1);
  }

  // callback
  // 주로 비동기 또는 이벤트 핸들링에서 사용하는 함수의 표현식.
  // 비동기의 특징:
  // 1. 어떤 함수가 시작하는 시간 또는 지점, 어떤 함수가 종료되는 시간 또는 지점이 명확하지 않은 코드의 형태
  // 2. 정상적인 코드에서 분리된 형태. (모든 코드는 위에서 아래로 실행. 하나의 명령이 종료되어야 다음 명령이 실행된다.)
  //    --> 하나의 명령이 종료되지 않은 상태에서 다음 코드가 실행된다.

  // 함수를 변수에 할당
  var printMessage = function (message) {
    console.log(message);
  };
  // 변수에 할당된 함수를 호출
  console.log(printMessage, typeof printMessage);
  printMessage("good");

  function printSumResult(from, to, endFunction) {
    // setTimeout(함수, 지연시간): 비동기로 만드는 코드
    setTimeout(function () {
      var sum = 0;
      for (var i = from; i <= to; i++) {
        sum += i;
      }
      console.log(sum);
      endFunction(sum);
    }, 1000);
  }
  printSumResult(1, 1_000_000_000, function (sum) {
    alert("결과는 " + sum + " 입니다.");
  });
  printSumResult(1000, 1_000_000_000, function (sum) {
    if (confirm("결과 보시겠습니까?")) {
      alert(sum);
    }
  });

  printCalcResult(10, 20, "+");
  printCalcResult(10, 20, "-");
  printCalcResult(10, 20, "/");
  printCalcResult(10, 20, "*");

  // getAddResult(100, 200);

  function printCalcResult(number1, number2, operator) {
    if (operator === "+") {
      var result = getAddResult(number1, number2);
      console.log(result);
    } else if (operator === "-") {
      var result = getSubtractResult(number1, number2);
      console.log(result);
    } else if (operator === "/") {
      var result = getDivideResult(number1, number2);
      console.log(result);
    } else if (operator === "*") {
      var result = getMultiplicateResult(number1, number2);
      console.log(result);
    }
  }
  function getAddResult(number1, number2) {
    return number1 + number2;
  }
  function getSubtractResult(number1, number2) {
    return number1 - number2;
  }
  function getDivideResult(number1, number2) {
    return number1 / number2;
  }
  function getMultiplicateResult(number1, number2) {
    return number1 * number2;
  }
};

function addAll() {
  // arguments 배열 ==> 반복하면서 모든 값을 더한다.
  var sum = 0;
  for (var i = 0; i < arguments.length; i++) {
    sum += arguments[i];
  }
  return sum;
}
var addResult = addAll(1, 2, 3, 4, 5, 6, 7, 8, 9);
console.log(addResult);

function calc(num1, num2) {
  console.log(arguments);
  return num1 + num2;
}
//------------------------------
function calc(num1, num2) {
  return num1 + num2;
}
var result = calc(10, 30);
console.log(result); //40

result = calc(10, 30, 100);
console.log(result); //40

result = calc(10, 30, 100, 1000);
console.log(result); //40
//-> 40이 나오는 이유는 값을 return으로 바로 전달하는 것이 아니라 중간에 array가 있어서 인덱스의 값을 전달하기 때문

result = calc(10);
console.log(result); //NaN

result = calc();
console.log(result); //NaN
