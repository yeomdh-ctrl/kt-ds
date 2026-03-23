$().ready(function () {
  $("#package-ticket-count")
    .on("keyup", function () {
      var price = $(this).closest(".package").data("price");

      //input에다가 적었던 값을 가져오는 함수
      var count = $(this).val();
      console.log(count);

      var amount = price * count;
      $("#amount").text(amount);
    })
    .on("change", function () {
      console.log("change");
      //keyup에 있는 function을 동작해라
      $(this).trigger("keyup");
    });
});
