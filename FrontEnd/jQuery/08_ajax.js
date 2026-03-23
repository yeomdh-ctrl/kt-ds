// https://jsonplaceholder.typicode.com/comments
$().ready(function () {
  $(".load-comments").on("click", function () {
    $(".spinner").show();
    // 비동기로 url 호출
    // window.fetch(url); ==> Promise 반환
    var fetchProm = fetch("https://jsonplaceholder.typicode.com/comments");
    // pending ==> 서버에게 HTTP 요청을 진행중인 상태
    // fulfilled ==> 서버가 fetch에게 HTTP 요청에 대한 값을 반환 완료한 상태
    // ==> case1. 서버로 부터 정상적으로 반환되었다 ==> fetchProm.then(); 처리
    // ==> case2. 서버로 부터 에러가 반환되었다 ==> fetchProm.catch(); 처리

    // 서버로 보낸 HTTP 요청이 서버로부터 정상적으로 처리되어 값을 반환시킨 경우
    // 서버가 반환시킨 값을 console로 출력해본다
    fetchProm
      .then(function (jsonResponse /* 서버가 fetch에게 반환시킨 값*/) {
        // jsonResponse.json(); ==> 비동기 처리(Promise가 반환되었으므로)
        return jsonResponse.json();
      })
      .then(function (body /* jsonResponse.json()이 반환시킨 값*/) {
        // console.log(body);
        for (var i = 0; i < body.length; i++) {
          var comment = body[i];
          var bodyComment = comment.body;
          var li = $("<li>").text(bodyComment);
          $(".comments").append(li);
        }
        $(".spinner").hide();
      });

    // 일정 주기로 함수를 실행하는 함수
    // setInterval(function(){}, 1000); ==> 1초 주기로 함수를 실행
    // setInterval(function () {
    //   console.log(fetchProm);
    // }, 100);
  });
});

// window.onload = function () {
//   var button = this.document.querySelector(".call-promise");

//   button.addEventListener("click", function () {
//     var delay = parseInt(Math.random() * 10000);

//     var prom = new Promise(function (resolve, reject) {
//       // 비 동기 코드 실행
//       setTimeout(function () {
//         if (delay % 2 === 0) {
//           reject(delay);
//         } else {
//           resolve(delay);
//         }
//       }, delay);
//     });

//     // then은 성공, catch는 실패
//     prom
//       .then(function (delay) {
//         //resolve
//         //비 동기 사용
//         setTimeout(function () {
//           return new Promise(fn1, fn2);
//         }, 100);
//         alert(delay);
//       })
//       .then(function () {})
//       .catch(function (delay) {
//         //reject
//         console.log("에러 발생", delay);
//       });
//   });
// };
