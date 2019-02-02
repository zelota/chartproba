window.com_home_chartcomponent_ChartComponent = function () {
    gbl_tableRpcProxy = this.getRpcProxy();

    mylibrary.ChartComponent();

    /* change state */
    this.onStateChange = function () {
        alert('onStateChange');
    };

    /* bind the 'server sent data' function. */
    this.registerRpc({
        dataFromServer: function (jsondata) {
            window.dataFromServer(jsondata);
            alert('registerRpc');
        }
    });

};
