// window.onload = function () {
//   var h1 = document.querySelector("h1");
//   console.log(h1.innerText);
//   h1.innerText = "어디로 가고 싶으세요?";
// };

// -> jQuery로 대체

// window.onload에 대응되는 코드
// jQuery(document).ready(function () {});

// 조금 더 짧은 표현식(jQuery = $)
// $(document).ready(function () {});

// 더 짧은 표현식((document) = ())
$().ready(function () {
  //   var h1 = document.querySelector("h1");
  var h1 = $("h1");
  //   console.log(h1.innerText);
  console.log(h1.text());
  //   h1.innerText = "어디로 가고 싶으세요?";
  h1.text("어디로 가고 싶으세요?");

  // p태그의 내용을 가져와서 alert로 출력한다.
  alert($("p").text());
  // p태그의 내용을 "다음 여행을 계획해보세요." 라고 변경한다.
  $("p").text("다음 여행을 계획해보세요.");
});

// 제일 짧은 표현식
// $(function () {});
