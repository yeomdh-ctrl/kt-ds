$().ready(function () {
  // 새로운 p 태그를 만든다. 내용은 after 라고 한다.
  // 새로운 p 태그는 wrapper 바깥 아래쪽에 위치한다.
  var newp1 = $("<p>");
  console.log(newp1);
  newp1.text("after");
  $(".wrapper").after(newp1);
  // 새로운 p 태그를 만든다. 내용은 before 라고 한다.
  // 새로운 p 태그는 wrapper 바깥 위쪽에 위치한다.
  var newp2 = $("<p>");
  newp2.text("before");
  $(".wrapper").before(newp2);
  // 새로운 p 태그를 만든다. 내용은 prepend 라고 한다.
  // 새로운 p 태그는 wrapper 안쪽 위에 위치한다.
  var newp3 = $("<p>");
  newp3.text("prepend");
  $(".wrapper").prepend(newp3);
  // 새로운 p 태그를 만든다. 내용은 append 라고 한다.
  // 새로운 p 태그는 wrapper 안쪽 아래에 위치한다.
  var newp4 = $("<p>");
  newp4.text("append");
  $(".wrapper").append(newp4);

  // 새로운 div 태그를 만든다. 내용은 newDiv로 한다
  // 새로운 div 태그는 ".a" 바깥 아래쪽에 위치한다
  var newDiv = $("<div>");
  newDiv.text("newDiv");
  $(".a").before(newDiv);

  // 새로운 div 태그를 만든다. 내용은 newDiv2로 한다
  // 새로운 div 태그는 ".a" 바깥 위쪽에 위치한다
  var newDiv2 = $("<div>");
  newDiv2.text("newDiv2");
  $(".a").after(newDiv2);

  // 새로운 span 태그를 만든다. 내용은 newSpan로 한다
  // 새로운 span 태그는 ".b" 안쪽 아래에 위치한다
  var newSpan = $("<span>");
  newSpan.text("newSpan");
  $(".b").append(newSpan);
  // span이 inline view 라서 옆으로 나옴

  var newSpan2 = $("<span>");
  newSpan2.text("newSpan2");
  $(".b").prepend(newSpan2);
});
