$().ready(function () {
  $(".add").on("click", function () {
    var count = $(".category li").length;

    if (count < 10) {
      var addItem = $("<li>");
      $(".category").append(addItem);
      var listItem = $(".category li").length;
      addItem.text("아이템 목록" + listItem);
      $(".message").text("총 " + listItem + "개 의 아이템이 등록되었습니다.");
    } else {
      alert("더 이상 추가할 수 없습니다.");
    }
  });

  $(".delete").on("click", function () {
    var count = $(".category li").length;
    if (count > 0) {
      $(".category").children("li").remove();
      $(".message").text("총 0개 의 아이템이 등록되었습니다.");
    } else {
      alert("더 이상 제거할 항목이 없습니다.");
    }
  });
});
