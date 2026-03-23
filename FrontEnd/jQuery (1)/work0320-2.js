window.onload = function () {
  var addBtn = document.querySelector(".add");
  var deleteBtn = document.querySelector(".delete");
  var categoryList = document.querySelector(".category");
  var messageBox = document.querySelector(".message");

  addBtn.addEventListener("click", function () {
    var count = categoryList.querySelectorAll("li").length;

    if (count < 10) {
      var addItem = document.createElement("li");
      categoryList.appendChild(addItem);

      var listItemCount = categoryList.querySelectorAll("li").length;
      addItem.innerText = "아이템 목록" + listItemCount;
      messageBox.innerText =
        "총 " + listItemCount + "개 의 아이템이 등록되었습니다.";
    } else {
      alert("더 이상 추가할 수 없습니다.");
    }
  });

  deleteBtn.addEventListener("click", function () {
    var listItems = categoryList.querySelectorAll("li");
    var count = listItems.length;

    if (count > 0) {
      listItems.forEach(function (li) {
        li.remove();
      });
      messageBox.innerText = "총 0개 의 아이템이 등록되었습니다.";
    } else {
      alert("더 이상 제거할 항목이 없습니다.");
    }
  });
};
