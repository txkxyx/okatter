$(function() {
  (function polling() {
    getCountUp();
    window.setTimeout(polling, 2000);
  })();

  function getCountUp() {
    $.ajax({
      type: "GET",
      url: "get",
      content: "application/json",
      dataType: "json"
    })
      .done(function(data) {
        $("#contents").empty();
        for (var i = 0; i < data.length; i++) {
          var parent = $("<div>")
            .attr("class", "content-body")
            .attr("id", "c" + i);
          var child_address = $("<div>")
            .attr("class", "content-address")
            .text(data[i]["address"]);
          var child_text = $("<div>")
            .attr("class", "content-text")
            .text(data[i]["text"]);
          var child_name = $("<div>")
            .attr("class", "content-name inline-content")
            .text(data[i]["name"]);
          var child_date = $("<div>")
            .attr("class", "content-date inline-content")
            .text(
              data[i]["insert_time"]
                .split("T")
                .join(" ")
                .split("-")
                .join("/")
            );
          var icon = $("<i>").attr(
            "class",
            "fab fa-twitter fa-bule inline-content"
          );
          $(parent)
            .append(icon)
            .append(child_name)
            .append(child_date)
            .append(child_text)
            .append(child_address);
          $("#contents").append(parent);
        }
      })
      .fail(function(jqXHR, textStatus) {
        alert("error occured");
      });
  }
});
