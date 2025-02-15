/**
 * Created by vacuity on 15/11/8.
 */

var GysTicket={
    currPage: 0,
    initSelect: function(){
        this.initHtml();
        this.citySelect();
        this.levelSelect();
        this.costSelect();
    },

    initHtml: function() {

        var cost = $("#init-cost").val();
        //document.getElementById("init-cost").value="";
        var min = $("#init-min").val();
        //document.getElementById("init-city").value="";
        var max = $("#init-max").val();
        //document.getElementById("init-city").value="";
        var name = $("#init-name").val();
        //document.getElementById("init-city").value="";
        var page = $("#page").val();
        //document.getElementById("init-city").value="";
        var pageCount = $("#total-count").val();


        if (cost != null && cost != ''){
            $("#nonecost").removeClass("curr");
            $("." + cost).addClass("curr");
        }

        if (name != null && name != ''){
            document.getElementsByClassName("search-kw").value=name;
        }

        if (page != null && page != ''){
            GysTicket.currPage=page;
        }
        $(".mainnav").find("a").removeClass("curr");
        $(".mainnav").find(".supplier-ticket").addClass("curr");
        GysTicket.makePage(pageCount);
    },

    citySelect: function(){
        $("#nonecity").on("click", function () {
            $("#city").find("a.curr").removeClass("curr");
            $("#nonecity").addClass("curr");
            GysTicket.selectBtn();
        });
            $("#city").on("click", 'a', function () {
                $("#nonecity").removeClass("curr");
                $("#city").find("a.curr").removeClass("curr");
                $(this).addClass("curr");
                GysTicket.selectBtn();
            })
    },

    levelSelect: function(){
        $("#nonelevel").on("click", function () {
            $("#scenic-level").find("a.curr").removeClass("curr");
            $("#nonelevel").addClass("curr");
            GysTicket.selectBtn();
        });
            $("#scenic-level").on("click", 'a', function () {
                $("#nonelevel").removeClass("curr");
                $("#scenic-level").find("a.curr").removeClass("curr");
                $(this).addClass("curr");
                GysTicket.selectBtn();
            })
    },

    costSelect: function(){
        $("#nonecost").on("click", function () {
            $("#ticket-cost").find("a.curr").removeClass("curr");
            $("#nonecost").addClass("curr");
            GysTicket.selectBtn();
        });
            $("#ticket-cost").on("click", 'a', function () {
                $("#nonecost").removeClass("curr");
                $("#ticket-cost").find("a.curr").removeClass("curr");
                $(this).addClass("curr");
                GysTicket.selectBtn();
            })
    },

    initSearch: function(){
        $.post('/mall/ticket/facetTickets.jhtml', {
            'supplierId' : $("#supplierInfo").val()
        }, function(result) {

            if (result.crossCitys != null){
                var crossCitys = result.crossCitys;
                if (crossCitys.length > 0){
                    var city = $("#city").find("dd");
                    for (var i = 0; i < crossCitys.length; i++) {
                        var cityTemp =$("<a href='#'></a>");
                        var ctp = cityTemp.append(crossCitys[i]);
                        ctp.addClass("city-" + crossCitys[i]);
                        city.append(ctp);
                    }
                    var city = $("#init-city").val();
                    if (city != null && city != ''){
                        $("#nonecity").removeClass("curr");
                        var c_name = "city-" + city;
                        $("." + c_name).addClass("curr");
                    }
                }
            }

            if (result.sceAji != null){
                var sceAji = result.sceAji;
                if (sceAji.length > 0){
                    var level = $("#scenic-level").find("dd");
                    for (var i = 0; i < sceAji.length; i++) {
                        var levelTemp =$("<a href='#'></a>");
                        var ltp = levelTemp.append(sceAji[i]);
                        ltp.addClass("level-" + sceAji[i]);
                        level.append(ltp);
                    }
                    var level = $("#init-level").val();
                    if (level != null && level != ''){
                        $("#nonelevel").removeClass("curr");
                        var c_name = "level-" + level;
                        $("." + c_name).addClass("curr");
                    }
                }
            }

        });
    },


    searchBtn: function() {
        $("#search-btn").on("click", function () {
            GysTicket.searchBySelect();
            GysTicket.initPage();
        });
    },

    selectBtn: function(){
        GysTicket.initPage();
        GysTicket.searchBySelect();
    },

    initPage: function(){
        var city = $("#city").find("a.curr").text();
        var level = $("#scenic-level").find("a.curr").text();
        var cost = null;
        cost = $("#ticket-cost").find("a.curr").attr("id");

        $.post('/mall/ticket/countTicket.jhtml', {
            'page' : 1,
            'ticketName' : $("#kw").val(), 'city' : city,
            'level':level, 'cost':cost,
            'supplierId':$("#supplierInfo").val()
        }, function(result) {
            var total = result.total;
            GysTicket.makePagination(total);
        });
    },

    searchBySelect: function(page){
        var city = $("#city").find("a.curr").text();
        var level = $("#scenic-level").find("a.curr").text();
        var cost = null;
        var mincost = null;
        var maxcost = null;
        if ($("#mincost").val() == "" && $("#maxcost").val() == ""){
            cost = $("#ticket-cost").find("a.curr").attr("id");
        } else {
            mincost = $("#mincost").val();
            maxcost = $("#maxcost").val();
        }

        $.post('/mall/ticket/getProductTicket.jhtml', {
            'page' : page,
            'ticketName' : $("#kw").val(), 'city' : city,
            'level':level, 'cost':cost,
            'supplierId' : $("#supplierInfo").val()
        }, function(result) {
            var tickets = result.product;

            $("#ticket-list").empty();
            var html = $("#ticketTmpl").render(tickets);
            $("#ticket-list").append(html);
            GysTicket.currPage=page;
            GysTicket.changeLink();

            //if (result.crossCitys != null){
            //    var crossCitys = result.crossCitys;
            //    if (crossCitys.length > 0){
            //        var city = $("#city").find("dd");
            //        for (var i = 0; i < crossCitys.length; i++) {
            //            var cityTemp =$("<a></a>");
            //            var ctp = cityTemp.append(crossCitys[i]);
            //            city.append(ctp);
            //        }
            //    }
            //}

        });


    },

    changeLink: function(){
        var city = $("#city").find("a.curr").text();
        var level = $("#scenic-level").find("a.curr").text();
        var cost = null;
        var mincost = null;
        var maxcost = null;
        var param = "";


        if ($("#mincost").val() == "" && $("#maxcost").val() == ""){
            cost = $("#ticket-cost").find("a.curr").attr("id");
        } else {
            mincost = $("#mincost").val();
            maxcost = $("#maxcost").val();
        }
        var ticketName = $("#kw").val();
        if (ticketName == null){
            ticketName = "";
        }
        if (city == null){
            city = "";
        }
        if (level == null){
            level = "";
        }
        if (cost == null){
            cost = "";
        }
        if (mincost == null){
            mincost = "";
        }
        if (maxcost == null){
            maxcost = "";
        }
        var page = GysTicket.currPage;
        if (page == null){
            page = 0;
        }

        param = "page=" + page + "&city=" + city
            + "&level=" + level + "&cost=" + cost + "&mincost="
            + mincost + "&maxcost" + maxcost + "&ticketName=" + ticketName
            + "&supplierId=" + $("#supplierInfo").val();
        var json={time:new Date().getTime()};
        window.history.pushState(json,"",'/mall/ticket/gysTicket.jhtml?' + param);
    },

    initPage : function() {
        var city = $("#city").find("a.curr").text();
        var level = $("#scenic-level").find("a.curr").text();
        var cost = null;
        var mincost = null;
        var maxcost = null;
        var total = 0;
        if ($("#mincost").val() == "" && $("#maxcost").val() == ""){
            cost = $("#ticket-cost").find("a.curr").attr("id");
        } else {
            mincost = $("#mincost").val();
            maxcost = $("#maxcost").val();
        }
        $.post('/mall/ticket/countTicket.jhtml', {
            'page' : 1,
            'ticketName' : $(".search-kw").val(), 'city' : city,
            'level':level, 'cost':cost, 'mincost':mincost,
            'maxcost':maxcost,
            'supplierId':$("#supplierInfo").val()
        }, function(result) {
            total = result.total;
            GysTicket.makePage(total);
        });


    },

    makePage: function(total){
        $("#page-list").pagination(total, {
            link_to : "javascript:;",
            items_per_page : 10,
            prev_text: "&laquo;上一页",
            next_text: "下一页&raquo;",
            current_page : this.currPage,
            num_display_entries : 5,
            prev_show_always: false,
            next_show_always: false,
            callback: function(currPage){
                GysTicket.searchBySelect(currPage);

            }
        });
    }

}



$(function(){
    GysTicket.initSearch();
    GysTicket.initSelect();
    GysTicket.searchBtn();
})

