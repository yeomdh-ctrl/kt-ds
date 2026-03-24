// var runMode = "vanilla";
var runMode = "jquery";

$().ready(function () {
  if (runMode === "jquery") {
    $("#checked-all").on("change", function () {
      $("input[type='checkbox'][name='favorate-genre']").prop(
        "checked",
        $(this).prop("checked"),
      );
    });
    $("input[type='checkbox'][name='favorate-genre']").on(
      "change",
      function () {
        // 체크 박스의 개수 세기
        var checkbox = $("input[type='checkbox'][name='favorate-genre']");
        var checkboxCount = checkbox.length;
        // 체크한 체크 박스의 개수 세기
        // $("input[type='checkbox'][name='favorate-genre']:checked");
        var checkedCount = checkbox.filter(":checked").length;
        $("#checked-all").prop("checked", checkboxCount === checkedCount);
      },
    );
    // vanilla 에서 input, select의 value를 get 하려면 ==> element.value;
    // jQuery 에서는 element.val();
    $("#email").val("other@gmail.com");

    $("#jobs").on("change", function () {
      console.log($(this).val());
      console.log($(this).children("option:selected").text());
    });
    $("input[type='radio'][name='age']").on("change", function () {
      console.log($(this).is(":checked"), $(this).val());
    });
  }
});

window.onload = function () {
  if (runMode === "vanilla") {
    // 모든 form tag 공통.

    // id가 email인 것의 value 값을 가지고 온다.
    var email = document.querySelector("#email").value;
    console.log(email);

    // value 값 수정
    document.querySelector("#email").value = "other@gmail.com";

    var jobs = document.querySelector("#jobs").value;
    console.log(jobs); // 0

    // option의 value가 3인 것을 선택해라. 없는 value값을 선택하면 브라우저에 아무것도 나오지 않는다.
    document.querySelector("#jobs").value = "3";

    // 사용자가 select 태그에서 option을 변경했을 때 해당 값을 출력해라.(change)
    document.querySelector("#jobs").addEventListener("change", function () {
      // change된 걔의 value
      console.log(this.value);
      console.log(
        this.querySelector("option[value='" + this.value + "']").innerText,
      );
    });
    // radio event("click")  ==> radio를 클릭 할 때. 클릭 할 때 마다 console에 출력된다.
    // All은 배열을 줌 ==> for을 사용
    var radios = document.querySelectorAll("input[type='radio'][name='age']");
    // for (var i = 0; i < radios.length; i++) {
    //   radios[i].addEventListener("click", function () {
    //     console.log(this.checked, this.value);
    //   });
    // }
    // radio event("change") ==> radio가 선택 될 때. 선택이 바뀌어야지만 console에 출력된다.
    for (var i = 0; i < radios.length; i++) {
      radios[i].addEventListener("change", function () {
        console.log(this.checked, this.value);
      });
    }

    var checkboxes = document.querySelectorAll(
      "input[type='checkbox'][name='favorate-genre']",
    );
    // 4개 선택 시 전체 선택이 켜지게 하기 위해 먼저 가져오기
    var checkedAll = document.querySelector("#checked-all");
    // checkedAll에게 이벤트를 주어 선택하면 나머지 checkbox가 checked가 되게한다.
    checkedAll.addEventListener("change", function () {
      for (var i in checkboxes) {
        checkboxes[i].checked = this.checked;
      }
    });

    // 위의 반복문과 완전히 같은 반복문 작성법
    for (var i in checkboxes) {
      // i가 숫자일 때
      if (!isNaN(i)) {
        checkboxes[i].addEventListener("change", function () {
          // checkbox의 선택 상태가 변경될 때 마다 체크된 체크박수의 개수를 조회하여 출력.
          // checkboxes 다시 한번 반복
          var checkedCount = 0;
          for (var index in checkboxes) {
            if (checkboxes[index].checked) {
              checkedCount++;
            }
          }
          console.log(checkedCount, " 개의 체크박스가 선택됨");

          // checkbox의 개수와 check한 것의 개수가 같다면 전체선택을 check한다.
          checkedAll.checked = checkboxes.length === checkedCount;

          // checked 된 것만 출력을 한다
          if (this.checked) {
            console.log(this.value);
          }
        });
      }
    }
  }
};
