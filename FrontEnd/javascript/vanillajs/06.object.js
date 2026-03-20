// tempObject에 print라는 기능을 추가
Object.prototype.print = function () {
  console.log("객체의 내용", this);
};
var text = "asdasdasd";
text.print();

var tempObject = {};
tempObject.print();
console.dir(tempObject);

// String에 contains 라는 기능을 추가한다.
String.prototype.contains = function (findText) {
  console.log(findText);
  console.log(this);
  return this.indexOf(findText) >= 0;
};
window.onload = function () {
  var text = "abcdefg abcdefg";
  // string의 기능
  console.dir(String);
  var contain = text.contains("a"); // Uncaught TypeError: text.contains is not a function
  console.log(contain); // contains 기능을 추가해서 true로 알맞게 나옴.
  text = text.replaceAll("a", "A"); // 소문자a 를 찾아서 대문자 A로 바꿔라
  console.log(text);

  // 객체 구조(상속)

  // console.dir(String);

  var list = document.querySelector(".list");
  var listItems = [
    { tagName: "li", text: "first", class: "list-item" },
    { tagName: "li", text: "second", class: "list-item" },
    { tagName: "li", text: "third", class: "list-item" },
  ];
  for (var i = 0; i < listItems.length; i++) {
    var item = listItems[i];
    var eachItem = document.createElement(item.tagName);
    eachItem.className = item.class;
    eachItem.innerText = item.text;

    list.appendChild(eachItem);
  }

  function calc(param) {
    return (param.n1 || 0) + (param.n2 || 0) + (param.n3 || 0); // or을 사용해서 undefined 값을 0 으로 처리
  }
  var result = calc({ n1: 10, n3: 50 }); // 많은 것을 만들 때에는 객체를 사용해서 보낸다
  console.log(result);

  function getObject() {
    return {
      price: 10000000,
      name: "iphone",
      model: "I1322314",
      fan: 8,
      chain: ["GS", "CJ", "HANJIN", "etc"],
      address: {
        city: "seoul",
        state: "guro",
      },
    };
  }
  var obj = getObject();
  console.log(obj.chain);

  var headphone = {
    "serial-number": "SN1501234",
    modelName: "XM-5",
    manufacture: "Sony",
    type: "over-ear",
    power: false,
    powerOn() {
      console.log(this.modelName, "이 켜집니다.");
      this.power = true;
    },
    powerOff() {
      console.log(this.modelName, "이 꺼집니다.");
      this.power = false;
    },
  };
  console.log(headphone, typeof headphone);
  console.log(headphone.modelName);
  console.log(headphone["modelName"]);
  console.log(headphone["serial-number"]); // 빼기는 쓸 수 없으니 이런 식으로 호출 해야함

  headphone.powerOn();
  console.log(headphone.power);
  headphone.powerOff();
  console.log(headphone.power);
};
