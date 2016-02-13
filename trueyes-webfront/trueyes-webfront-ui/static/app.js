angular.module('trueyes', ['ui.bootstrap', 'ui.utils', 'ui.router', 'ngAnimate', 'root', 'home', 'customer', 'inventory', 'orders', 'reports']);

angular.module('trueyes').config(function($stateProvider, $urlRouterProvider, $httpProvider) {

    /* Add New States Above */
    $urlRouterProvider.otherwise('/home');

    $httpProvider.defaults.headers.common['X-Requested-With'] = 'XMLHttpRequest';

});

angular.module('trueyes').run(function($rootScope) {

    $rootScope.safeApply = function(fn) {
        var phase = $rootScope.$$phase;
        if (phase === '$apply' || phase === '$digest') {
            if (fn && (typeof(fn) === 'function')) {
                fn();
            }
        } else {
            this.$apply(fn);
        }
    };

});
