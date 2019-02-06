/**
 * Alap, default Chart.JS bar grafikon komponens.
 * A <code>myChart</code>-al lehet hivatkozni a chart-ra.
 *
 * @type {{}}
 */
var mylibrary = mylibrary || {};
// ez a chart kontextje
var ctx = null;
// ez a chat maga
var myChart = null;

mylibrary.ChartComponent = function (element) {
    element = document.getElementById("ChartComponentVer1");
    element.innerHTML =
        "<canvas id=\"chartComponentCanvas\" width=\"400\" height=\"400\"></canvas>";

    ctx = document.getElementById("chartComponentCanvas").getContext('2d');
    myChart = new Chart(ctx, {
        type: 'bar',
        data: {
            labels: ["Red", "Blue", "Yellow", "Green", "Purple", "Orange"],
            datasets: [{
                label: '# of Votes',
                data: [12, 19, 3, 5, 2, 3],
                backgroundColor: [
                    'rgba(255, 99, 132, 0.2)',
                    'rgba(54, 162, 235, 0.2)',
                    'rgba(255, 206, 86, 0.2)',
                    'rgba(75, 192, 192, 0.2)',
                    'rgba(153, 102, 255, 0.2)',
                    'rgba(255, 159, 64, 0.2)'
                ],
                borderColor: [
                    'rgba(255,99,132,1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 1
            }]
        },
        options: {
            scales: {
                yAxes: [{
                    ticks: {
                        beginAtZero: true
                    }
                }]
            }
        }
    });

    //return element;
};
