// window.onload = function () {
//   // 모든 li 태그를 가져와서 내용을 "서울"로 변경한다.
//   var listItems = document.querySelectorAll("li");
//   for (var i = 0; i < listItems.length; i++) {
//     listItems[i].innerText = "서울";
//   }
// };

$().ready(function () {
  $("li").text("서울");
  // 클래스가 promo인 것의 텍스트를 "부산" 으로 변경
  $(".promo").text("부산");
  //id가 destinations인 자식 요소 중 두번째 li의 텍스트를 경주로 변경한다
  $("#destinations  li:nth-child(2)").text("경주");
  //   $("#destinations  li").first().next().text("경주");
});

// 두번째(1번 인덱스)만 변경
// $().ready(function () {
//   $("li").eq(1).text("서울");
// });
