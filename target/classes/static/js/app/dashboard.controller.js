(function () {
    'use strict';
    angular
            .module('app')
            .controller('DashboardController', DashboardController);

    DashboardController.$inject = ['$http'];

    function DashboardController($http) {
        var vm = this;

        vm.dashboard = [];
        vm.getAll = getAll;

        init();

        function init() {
            getAll();
        }
        
        function getAll(){
            var url = "/project/all";
            var projectData = $http.get(url);
            projectData.then(function (response){
               vm.dashboard = response.data;
            });
            
        }
    }
})();