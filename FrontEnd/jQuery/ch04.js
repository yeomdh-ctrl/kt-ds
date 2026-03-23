$().ready(function () {
  // 처음부터 존재했던 ".package-button-area" dom을 통해서
  // 새롭게 생성된 "p.white-color" 에게 click 이벤트를 할당한다.
  $(".package-button-area").on("click", "p.white-color", function () {
    alert($(this).text());
  });

  // $(".package-button-area")
  //   .find("p")
  //   .on("click", function () {
  //     alert($(this).text());
  //   });
});

$(".package-green-button").on("click", function () {
  // var price = $(this).parent().parent().parent().data("price");
  // html 구조가 변경되면 parent가 바뀔 수 있으므로 한번에 찾아가는 방법
  var price = $(this).closest(".package").data("price");

  // var button = $("<p>");
  // button.text("From $" + vacationPricerice);
  // price.on("click", function () {
  //   alert($(this).text());
  // });

  // 클릭한 것만 제거되고 p 태그 추가
  var button = $("<p>");
  button.text(price);
  $(this).after(button);
  $(this).remove();

  // 새롭게 만든 p 태그에게 inline style 부여
  // button.css({ color: "#fff" });

  // 새롭게 만든 p 태그에게 css에서 만든 white-color 클래스를 부여
  button.addClass("white-color");
});
$(".contact").on("click", function () {
  console.log(
    $(this)
      .prev()
      .find(".package-deal-comment")
      .each(function () {
        console.log($(this).text());
      }),
  );
});
