angular.module('eshop', []).controller('indexController', function ($scope, $http) {
    $scope.fillTable = function () {
        $http.get('http://localhost:8189/eshop/api/V1/products')
            .then(function (response) {
                $scope.products = response.data;
            });
    };

    $scope.addProductToCart = function(id) {
        $http.get('http://localhost:8189/eshop/api/V2/cart/add/' + id)
        .then(function(response){
            $scope.showAllItemsInCart();
            });
        };

    $scope.incProductInCart= function(id) {
            $http.get('http://localhost:8189/eshop/api/V2/cart/inc/' + id)
            .then(function(response){
                $scope.showAllItemsInCart();
                });
            };

    $scope.minusProductInCart= function(id) {
                $http.get('http://localhost:8189/eshop/api/V2/cart/minus/' + id)
                .then(function(response){
                    $scope.showAllItemsInCart();
                    });
                };

    $scope.delProductFromCartById = function(id) {
        $http.get('http://localhost:8189/eshop/api/V2/cart/del/' + id)
        .then(function(response){
            $scope.showAllItemsInCart();
            });
        };

        $scope.clearCart = function() {
            $http.get("http://localhost:8189/eshop/api/V2/cart/clear")
            .then(function(response){
                $scope.showAllItemsInCart();
                });
            };

    $scope.showAllItemsInCart = function() {
        //console.log("Product to cart: " + id);
        $http.get('http://localhost:8189/eshop/api/V2/cart')
        .then(function(response){
        $scope.cart = response.data;
                                 });
        };

    $scope.saveCartToOrder= function() {
            $http.get('http://localhost:8189/eshop/api/V1/order/save')
            .then(function(response){

            });
            $scope.fillTable();
    }


 $scope.fillTable();
 $scope.showAllItemsInCart();
});