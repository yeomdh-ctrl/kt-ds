$().ready(function () {
  $(".load-git-users").on("click", function () {
    var fetchPromise = fetch("https://api.github.com/users");
    fetchPromise
      .then(function (fetchResult) {
        return fetchResult.json();
      })
      .then(function (users) {
        for (var i = 0; i < users.length; i++) {
          var user = users[i];
          var listItem = $("<li>");

          var userImage = $("<img>");
          userImage
            .attr("src", user.avatar_url)
            .css({ "border-radius": "50%", width: "100px" });
          listItem.append(userImage);

          var userName = $("<div>");
          userName
            .text(user.login)
            .data("url", user.html_url)
            .on("click", function () {
              // 페이지 이동 스크립트
              // location.href = "이동할 URL";
              var url = $(this).data("url");
              location.href = url;
            });

          listItem.append(userName);

          $(".posts").append(listItem);
        }
      });
  });
});
