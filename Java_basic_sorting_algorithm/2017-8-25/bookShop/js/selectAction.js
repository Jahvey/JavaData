var cityArray = new Array(); 

cityArray[1] = new Array(
	"北京","东城区|西城区|朝阳区|丰台区|石景山区|海淀区|顺义区|通州区|大兴区|房山区|门头沟区|昌平区|平谷区|密云区|怀柔区|延庆区|其他"
);

cityArray[2] = new Array(
	"四川","成都市|自贡市|绵阳市|攀枝花市|泸州市|德阳市|广元市|遂宁市|乐山市|内江市|雅安市|达州市|南充市|宜宾市|其他"
);

cityArray[3] = new Array(
	"广东","广州|深圳|佛山|东莞|中山|珠海|江门|肇庆|惠州|汕头|潮州|揭阳|湛江|茂名|阳江|韶关|清远|云浮|其他"
);

cityArray[4] = new Array("其他","其他");

cityArray[0] = new Array("请选择省份","-请选择-");

function getCity(currProvince)  
{  
    //当前 所选择 的 省  
    var currProvince = currProvince;  
    var i,j,k;  
    //清空 城市 下拉选单  
    document.all.selCity.length = 0 ;
    for (i = 0 ;i <cityArray.length;i++)  
    {  
        //得到 当前省 在 城市数组中的位置  
        if(cityArray[i][0]==currProvince)  
        {  
            //得到 当前省 所辖制的 地市  
            var tmpcityArray = cityArray[i][1].split("|")  
            for(j=0;j<tmpcityArray.length;j++)  
            {  
                //填充 城市 下拉选单  
                document.all.selCity.options[document.all.selCity.length] = new Option(tmpcityArray[j],tmpcityArray[j]);  
            }  
        }  
    }  
}