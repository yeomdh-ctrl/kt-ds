window.onload = function () {
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
};
