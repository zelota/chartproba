/**
 * Chart.JS komponens konnektor.
 * Ezzel lehet vezérelni a szerver oldalról a komponenst.
 * A szerver oldalra nem küld semmit.
 *
 */
window.com_home_chartcomponent_ChartComponent = function () {
    gbl_tableRpcProxy = this.getRpcProxy();

    mylibrary.ChartComponent(this.getElement());

    /* szerver oldaról kapott adatok */
    this.onStateChange = function () {
        var chart_target = this.getState().target;
        var json_data_string = this.getState().data;
        if (json_data_string != null && json_data_string != '') {
            var chart_data = JSON.parse(json_data_string);

            if ('CONFIG' == chart_target) {
                myChart.type = chart_data.type;
                myChart.data = chart_data.data;
                myChart.options = chart_data.options;
                myChart.update();
            }
            if ('DATA' == chart_target) {
                myChart.data.datasets[0].data = chart_data;
                myChart.update();
            }
        }
    };

    /* szerver felé ezzel küldünk adatot */
    this.registerRpc({
        // ezt a funckiót az RPC interface-ben kell definiálni
        // dataToServer: function (jsondata) {
        //     window.dataToServer(jsondata);
        // }
    });

}
;
