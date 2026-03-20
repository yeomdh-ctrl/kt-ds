$().ready(function () {
  $(".add").on("click", function () {
    var addItem = $("<li>");
    addItem.text("아이템 목록");
    $(".category").append(addItem);
  });

  $(".delete").on("click", function () {
    $(".category").children("li").remove();
  });
});
