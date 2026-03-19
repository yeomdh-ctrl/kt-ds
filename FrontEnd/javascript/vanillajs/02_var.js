window.onload = function () {
  /*number*/
  var number = 10;
  console.log("변수의 값은", number, "변수의 타입은", typeof number);
  var x2 = 21.2314415512312312314214;
  console.log("변수의 값은", x2, "변수의 타입은", typeof x2);
  /*string*/
  number = "aaaaaaa";
  console.log("변수의 값은", number, "변수의 타입은", typeof number);
  /*undefine*/
  var x;
  console.log("변수의 값은", x, "변수의 타입은", typeof x);
  /*null(object)*/
  var x2 = null;
  console.log("변수의 값은", x2, "변수의 타입은", typeof x2);

  /*window 라는 전역 객체에다가 변수를 만들어서 사용*/
  x3 = "bbbbbbbb";
  console.log("변수의 값은", x3, "변수의 타입은", typeof x3);
};
