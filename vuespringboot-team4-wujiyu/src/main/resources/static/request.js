/** 获取用户列表 */
function listUser(setList){
    $.ajax({
        type: "get",
        url: "/user",
        dataType: "json",
        success: function (result) {
            if (result.code == 1){
                for (var i=0;i<result.data.length;i++){
                    result.data[i].hobby =JSON.parse(result.data[i].hobby);
                }
                setList(result.data)
            } else {
                setList(null);
            }
        },
        error: function (error) {
            alert(error.message);
        }
    })
}

function addUser(that,arr) {
    arr.hobby = JSON.stringify(arr.hobby);
    $.ajax({
        type: "post",
        url: "/user",
        data: JSON.stringify(arr),
        contentType: "application/json; charset=UTF-8",
        dataType: "json",
        success: function (result) {
            console.log(result);
            if (result.code == 1){
                result.data.hobby = JSON.parse(result.data.hobby);
                // that.list.push(result.data);
                console.log(that.list);
                that.setSlist(that.list);
                that.changeOverlay();
            } else {
                alert("添加失败");
            }
        },
        error: function (error) {
            console.log(error)
            alert("添加失败");
        }
    })
}

function deleteUser(setSlist,list,index,id){
    $.ajax({
        type: "DELETE",
        url: "/user/"+id,
        dataType: "json",
        success: function (result) {
            console.log(result);
            if (result.code == 1){
                list.splice(index, 1);
                setSlist(list);
            } else {
                alert("删除失败");
            }
        },
        error: function (error) {
            alert(error.message);
        }
    })
}

function updateUser(that,arr){
    console.log("update user");
    var data = JSON.parse(JSON.stringify(arr));
    data.hobby = JSON.stringify(data.hobby);
    $.ajax({
        type: "put",
        url: "/user",
        data: JSON.stringify(data),
        contentType: "application/json; charset=UTF-8",
        dataType: "json",
        success: function (result) {
            if (result.code == 1){
                console.log("update success");
                result.data.hobby = JSON.parse(result.data.hobby);
                console.log(result.data)
                // arr = result.data;
                Vue.set(that.list, that.selected, result.data);
                that.selected = -1;
                that.changeOverlay();
            } else {
                alert("修改失败");
            }
        },
        error: function (error) {
            console.log(error)
            alert("修改失败");
        }
    })
}