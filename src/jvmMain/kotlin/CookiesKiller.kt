package my.local.oreo.extention

class CookiesKiller() {
    val killcookies =
        "javascript: if(window.location.href.indexOf(%22ft.com%22) > -1) { (function () { var cookies = document.cookie.split(%22; %22); for (var c = 0; c < cookies.length; c++) { var d = window.location.hostname.split(%22.%22); while (d.length > 0) { var cookieBase = encodeURIComponent(cookies[c].split(%22;%22)[0].split(%22=%22)[0]) + %22=; expires=Thu, 01-Jan-1970 00:00:01 GMT; domain=%22 + d.join(%22.%22) + %22 ; path=%22; var p = location.pathname.split(%22/%22); document.cookie = cookieBase + %22/%22; while (p.length > 0) { document.cookie = cookieBase + p.join(%22/%22); p.pop(); }; d.shift(); }}})(); window.location.href=%22https://m.facebook.com/l.php?u=%22+encodeURIComponent(window.location.href)+%22?ClearCache=true%22;%20alert(%22To%20read%20FT.com,%20we%20must%20redirect%20you%20through%20FaceBook!%22);%20}%20else%20if%20(window.location.href.indexOf(%22technologyreview.com%22)%20%3E%20-1%20||%20window.location.href.indexOf(%22investors.com%22)%20%3E%20-1%20||%20window.location.href.indexOf(%22businessinsider.com%22)%20%3E%20-1)%20{%20(function()%7Bwindow.location.href%20%3D%20%22https%3A%2F%2Foutline.com%2F%22%20%2B%20window.location.href%7D)();%20}%20else%20if%20(window.location.href.indexOf(%22wsj.com%22)%20%3E%20-1%20){%20void((function(){var%20a,b,c,e,f;f=0;a=document.cookie.split(%22;%20%22);%20for(e=0;e%3Ca.length&&a[e];e++){f++;for(b=%22.%22+location.host;b;b=b.replace(/^(?:%5C.|[^%5C.]+)/,%22%22)){%20for(c=location.pathname;c;c=c.replace(/.\$/,%22%22)){%20document.cookie=(a[e]+%22;%20domain=%22+b+%22;%20path=%22+c+%22;%20expires=%22+new%20Date((new%20Date()).getTime()-1e11).toGMTString());%20}}}alert(%22Expired%20%22+f+%22%20cookies\\nRedirecting%20via%20Twitter%20Referrer%22);})());%20window.localStorage.clear();%20var%20pageTitle=document.getElementsByTagName(%27title%27)[0].innerText;%20var%20host=(window.location.hostname);%20var%20host=host.replace(%27www.%27,%27%27);%20var%20host%20=%20host.split(%22.%22,%201);%20var%20pageTitle%20=%20pageTitle.toString();%20var%20twit=%20%27https://twitter.com/search?q=%27%20+%20host%20+%20%27%20%27+%20pageTitle%20+%20%27&src=typd%27;%20window.open(twit,%20%27_self%27);%20}%20else%20{%20(function%20()%20{%20var%20cookies%20=%20document.cookie.split(%22;%20%22);%20for%20(var%20c%20=%200;%20c%20%3C%20cookies.length;%20c++)%20{%20var%20d%20=%20window.location.hostname.split(%22.%22);%20while%20(d.length%20%3E%200)%20{%20var%20cookieBase%20=%20encodeURIComponent(cookies[c].split(%22;%22)[0].split(%22=%22)[0])%20+%20%22=;%20expires=Thu,%2001-Jan-1970%2000:00:01%20GMT;%20domain=%22%20+%20d.join(%22.%22)%20+%20%22%20;%20path=%22;%20var%20p%20=%20location.pathname.split(%22/%22);%20document.cookie%20=%20cookieBase%20+%20%22/%22;%20while%20(p.length%20%3E%200)%20{%20document.cookie%20=%20cookieBase%20+%20p.join(%22/%22);%20p.pop();%20};%20d.shift();}}})();window.localStorage.clear();%20window.open(document.location%20+%20%22?ClearCache=true%22,%20%22_self%22);}"
}
