angular.module('trueyes', ['ui.bootstrap', 'ui.utils', 'ui.router', 'ngAnimate', 'rootModule', 'homeModule', 'crmModule']);

angular.module('trueyes').config(function($stateProvider, $urlRouterProvider, $httpProvider) {

    /* Add New States Above */
    $urlRouterProvider.otherwise('/dashboard');

    // To distinguish ajax call with normal http calls.
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
