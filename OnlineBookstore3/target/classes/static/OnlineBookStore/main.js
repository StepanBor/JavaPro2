(window["webpackJsonp"] = window["webpackJsonp"] || []).push([["main"],{

/***/ "./src/$$_lazy_route_resource lazy recursive":
/*!**********************************************************!*\
  !*** ./src/$$_lazy_route_resource lazy namespace object ***!
  \**********************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

function webpackEmptyAsyncContext(req) {
	// Here Promise.resolve().then() is used instead of new Promise() to prevent
	// uncaught exception popping up in devtools
	return Promise.resolve().then(function() {
		var e = new Error("Cannot find module '" + req + "'");
		e.code = 'MODULE_NOT_FOUND';
		throw e;
	});
}
webpackEmptyAsyncContext.keys = function() { return []; };
webpackEmptyAsyncContext.resolve = webpackEmptyAsyncContext;
module.exports = webpackEmptyAsyncContext;
webpackEmptyAsyncContext.id = "./src/$$_lazy_route_resource lazy recursive";

/***/ }),

/***/ "./src/app/app.component.css":
/*!***********************************!*\
  !*** ./src/app/app.component.css ***!
  \***********************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = ".wrapper {\r\n  display: flex;\r\n  width: 100%;\r\n  align-items: stretch;\r\n}\r\n/*.footer{*/\r\n/*position: absolute;*/\r\n/*display: -ms-flexbox;*/\r\n/*display: flex;*/\r\n/*-ms-flex-wrap: wrap;*/\r\n/*flex-wrap: wrap;*/\r\n/*-ms-flex-align: center;*/\r\n/*align-items: center;*/\r\n/*-ms-flex-pack: justify;*/\r\n/*!*justify-content: space-between;*!*/\r\n/*justify-content: center;*/\r\n/*padding: 0.5rem 1rem;*/\r\n/*background-color: #343a40;*/\r\n/*bottom: 0;*/\r\n/*width: 100%;*/\r\n/*}*/\r\n.footer{\r\n  display: block;\r\n  align-self: flex-end;\r\n  background-color: #343a40;\r\n  margin-top: 20px;\r\n  width: 100%;\r\n}\r\n.wrapper2 {\r\n  display: flex;\r\n  width: 100%;\r\n  align-items: flex-end;\r\n}\r\n"

/***/ }),

/***/ "./src/app/app.component.html":
/*!************************************!*\
  !*** ./src/app/app.component.html ***!
  \************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "\r\n<app-nav-bar (sideBarTogle)=\"onSideMenuShow()\"></app-nav-bar>\r\n<!--<div class=\"container-fluid\">-->\r\n<!--<div class=\"row\">-->\r\n<!--<div class=\"col-md-12\">-->\r\n\r\n<div class=\"wrapper\">\r\n  <!--<img src=\"http://localhost:8080/static/book.jpg\" style=\"z-index: -1; position: absolute;\">-->\r\n  <div [@sideMenu]=\"sideMenu\" style=\"background-color: rgba(52,58,64,0.9)\">\r\n    <app-side-menu></app-side-menu>\r\n  </div>\r\n\r\n  <div class=\"container-fluid\" style=\"margin-top: 20px\">\r\n    <div class=\"row\">\r\n      <div class=\"col-md-12\">\r\n        <router-outlet></router-outlet>\r\n      </div>\r\n    </div>\r\n    <!--<div class=\"row\">-->\r\n    <!---->\r\n    <!--</div>-->\r\n  </div>\r\n\r\n</div>\r\n<!--</div>-->\r\n<!--</div>-->\r\n<!--<div class=\"row\">-->\r\n<!--<div class=\"col-md-12\">-->\r\n<!--style=\"position: absolute;bottom: 0;background-color: #343a40;width: 100%\"-->\r\n<app-page-footer class=\"footer\"></app-page-footer>\r\n<!--</div>-->\r\n<!--</div>-->\r\n<!--</div>-->\r\n\r\n\r\n\r\n\r\n\r\n"

/***/ }),

/***/ "./src/app/app.component.ts":
/*!**********************************!*\
  !*** ./src/app/app.component.ts ***!
  \**********************************/
/*! exports provided: AppComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AppComponent", function() { return AppComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_animations__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/animations */ "./node_modules/@angular/animations/fesm5/animations.js");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};


var AppComponent = /** @class */ (function () {
    function AppComponent() {
        this.title = 'bookstore3';
        this.sideMenu = 'showSide';
    }
    AppComponent.prototype.onSideMenuShow = function () {
        this.sideMenu = (this.sideMenu === 'showSide' ? 'hideSide' : 'showSide');
    };
    AppComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-root',
            template: __webpack_require__(/*! ./app.component.html */ "./src/app/app.component.html"),
            styles: [__webpack_require__(/*! ./app.component.css */ "./src/app/app.component.css")],
            animations: [
                Object(_angular_animations__WEBPACK_IMPORTED_MODULE_1__["trigger"])('sideMenu', [
                    Object(_angular_animations__WEBPACK_IMPORTED_MODULE_1__["state"])('hideSide', Object(_angular_animations__WEBPACK_IMPORTED_MODULE_1__["style"])({
                        'margin-left': '-250px',
                        'width': '250px',
                        'margin-top': '10px',
                        'border-radius': '10px',
                        'padding': '12px',
                        'display': 'block'
                    })),
                    Object(_angular_animations__WEBPACK_IMPORTED_MODULE_1__["state"])('showSide', Object(_angular_animations__WEBPACK_IMPORTED_MODULE_1__["style"])({
                        'margin-left': '20px',
                        'width': '250px',
                        'margin-top': '10px',
                        'border-radius': '10px',
                        'padding': '12px',
                        'display': 'block'
                    })),
                    Object(_angular_animations__WEBPACK_IMPORTED_MODULE_1__["transition"])('showSide <=> hideSide', Object(_angular_animations__WEBPACK_IMPORTED_MODULE_1__["animate"])(500)),
                ])
            ]
        })
    ], AppComponent);
    return AppComponent;
}());



/***/ }),

/***/ "./src/app/app.module.ts":
/*!*******************************!*\
  !*** ./src/app/app.module.ts ***!
  \*******************************/
/*! exports provided: AppModule */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AppModule", function() { return AppModule; });
/* harmony import */ var _angular_platform_browser__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/platform-browser */ "./node_modules/@angular/platform-browser/fesm5/platform-browser.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var angular_font_awesome__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! angular-font-awesome */ "./node_modules/angular-font-awesome/dist/angular-font-awesome.es5.js");
/* harmony import */ var _angular_forms__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! @angular/forms */ "./node_modules/@angular/forms/fesm5/forms.js");
/* harmony import */ var _angular_http__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! @angular/http */ "./node_modules/@angular/http/fesm5/http.js");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm5/router.js");
/* harmony import */ var _ng_bootstrap_ng_bootstrap__WEBPACK_IMPORTED_MODULE_6__ = __webpack_require__(/*! @ng-bootstrap/ng-bootstrap */ "./node_modules/@ng-bootstrap/ng-bootstrap/fesm5/ng-bootstrap.js");
/* harmony import */ var _angular_platform_browser_animations__WEBPACK_IMPORTED_MODULE_7__ = __webpack_require__(/*! @angular/platform-browser/animations */ "./node_modules/@angular/platform-browser/fesm5/animations.js");
/* harmony import */ var _app_component__WEBPACK_IMPORTED_MODULE_8__ = __webpack_require__(/*! ./app.component */ "./src/app/app.component.ts");
/* harmony import */ var _data_access_services_data_access_service__WEBPACK_IMPORTED_MODULE_9__ = __webpack_require__(/*! ./data-access-services/data-access.service */ "./src/app/data-access-services/data-access.service.ts");
/* harmony import */ var _can_deactivate_guard_service__WEBPACK_IMPORTED_MODULE_10__ = __webpack_require__(/*! ./can-deactivate-guard.service */ "./src/app/can-deactivate-guard.service.ts");
/* harmony import */ var _nav_bar_nav_bar_component__WEBPACK_IMPORTED_MODULE_11__ = __webpack_require__(/*! ./nav-bar/nav-bar.component */ "./src/app/nav-bar/nav-bar.component.ts");
/* harmony import */ var _home_home_component__WEBPACK_IMPORTED_MODULE_12__ = __webpack_require__(/*! ./home/home.component */ "./src/app/home/home.component.ts");
/* harmony import */ var _book_item_details_book_item_details_component__WEBPACK_IMPORTED_MODULE_13__ = __webpack_require__(/*! ./book-item-details/book-item-details.component */ "./src/app/book-item-details/book-item-details.component.ts");
/* harmony import */ var _book_item_small_card_book_item_small_card_component__WEBPACK_IMPORTED_MODULE_14__ = __webpack_require__(/*! ./book-item-small-card/book-item-small-card.component */ "./src/app/book-item-small-card/book-item-small-card.component.ts");
/* harmony import */ var _book_item_midle_card_book_item_midle_card_component__WEBPACK_IMPORTED_MODULE_15__ = __webpack_require__(/*! ./book-item-midle-card/book-item-midle-card.component */ "./src/app/book-item-midle-card/book-item-midle-card.component.ts");
/* harmony import */ var _home_book_item_line_book_item_line_component__WEBPACK_IMPORTED_MODULE_16__ = __webpack_require__(/*! ./home/book-item-line/book-item-line.component */ "./src/app/home/book-item-line/book-item-line.component.ts");
/* harmony import */ var _side_menu_side_menu_component__WEBPACK_IMPORTED_MODULE_17__ = __webpack_require__(/*! ./side-menu/side-menu.component */ "./src/app/side-menu/side-menu.component.ts");
/* harmony import */ var _shopping_cart_shopping_cart_component__WEBPACK_IMPORTED_MODULE_18__ = __webpack_require__(/*! ./shopping-cart/shopping-cart.component */ "./src/app/shopping-cart/shopping-cart.component.ts");
/* harmony import */ var _login_new_user_login_new_user_component__WEBPACK_IMPORTED_MODULE_19__ = __webpack_require__(/*! ./login-new-user/login-new-user.component */ "./src/app/login-new-user/login-new-user.component.ts");
/* harmony import */ var _user_cabinet_user_cabinet_component__WEBPACK_IMPORTED_MODULE_20__ = __webpack_require__(/*! ./user-cabinet/user-cabinet.component */ "./src/app/user-cabinet/user-cabinet.component.ts");
/* harmony import */ var _page_footer_page_footer_component__WEBPACK_IMPORTED_MODULE_21__ = __webpack_require__(/*! ./page-footer/page-footer.component */ "./src/app/page-footer/page-footer.component.ts");
/* harmony import */ var _auth_guard_service__WEBPACK_IMPORTED_MODULE_22__ = __webpack_require__(/*! ./auth-guard.service */ "./src/app/auth-guard.service.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};























var appRoutes = [
    { path: '', component: _home_home_component__WEBPACK_IMPORTED_MODULE_12__["HomeComponent"] },
    { path: 'bookItem/:bookId', component: _book_item_details_book_item_details_component__WEBPACK_IMPORTED_MODULE_13__["BookItemDetailsComponent"] },
    { path: 'cart', component: _shopping_cart_shopping_cart_component__WEBPACK_IMPORTED_MODULE_18__["ShoppingCartComponent"] },
    { path: 'userCabinet', canActivate: [_auth_guard_service__WEBPACK_IMPORTED_MODULE_22__["AuthGuard"]], component: _user_cabinet_user_cabinet_component__WEBPACK_IMPORTED_MODULE_20__["UserCabinetComponent"] },
];
var AppModule = /** @class */ (function () {
    function AppModule() {
    }
    AppModule = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["NgModule"])({
            declarations: [
                _app_component__WEBPACK_IMPORTED_MODULE_8__["AppComponent"],
                _nav_bar_nav_bar_component__WEBPACK_IMPORTED_MODULE_11__["NavBarComponent"],
                _home_home_component__WEBPACK_IMPORTED_MODULE_12__["HomeComponent"],
                _book_item_details_book_item_details_component__WEBPACK_IMPORTED_MODULE_13__["BookItemDetailsComponent"],
                _book_item_small_card_book_item_small_card_component__WEBPACK_IMPORTED_MODULE_14__["BookItemSmallCardComponent"],
                _book_item_midle_card_book_item_midle_card_component__WEBPACK_IMPORTED_MODULE_15__["BookItemMidleCardComponent"],
                _home_book_item_line_book_item_line_component__WEBPACK_IMPORTED_MODULE_16__["BookItemLineComponent"],
                _side_menu_side_menu_component__WEBPACK_IMPORTED_MODULE_17__["SideMenuComponent"],
                _shopping_cart_shopping_cart_component__WEBPACK_IMPORTED_MODULE_18__["ShoppingCartComponent"],
                _login_new_user_login_new_user_component__WEBPACK_IMPORTED_MODULE_19__["LoginNewUserComponent"],
                _user_cabinet_user_cabinet_component__WEBPACK_IMPORTED_MODULE_20__["UserCabinetComponent"],
                _page_footer_page_footer_component__WEBPACK_IMPORTED_MODULE_21__["PageFooterComponent"]
            ],
            imports: [
                _angular_platform_browser__WEBPACK_IMPORTED_MODULE_0__["BrowserModule"],
                _angular_forms__WEBPACK_IMPORTED_MODULE_3__["FormsModule"],
                _ng_bootstrap_ng_bootstrap__WEBPACK_IMPORTED_MODULE_6__["NgbModule"],
                angular_font_awesome__WEBPACK_IMPORTED_MODULE_2__["AngularFontAwesomeModule"],
                _angular_http__WEBPACK_IMPORTED_MODULE_4__["HttpModule"],
                _angular_router__WEBPACK_IMPORTED_MODULE_5__["RouterModule"].forRoot(appRoutes),
                _angular_platform_browser_animations__WEBPACK_IMPORTED_MODULE_7__["BrowserAnimationsModule"]
            ],
            entryComponents: [_login_new_user_login_new_user_component__WEBPACK_IMPORTED_MODULE_19__["LoginNewUserComponent"]],
            providers: [_data_access_services_data_access_service__WEBPACK_IMPORTED_MODULE_9__["DataAccessService"], _can_deactivate_guard_service__WEBPACK_IMPORTED_MODULE_10__["CanDeactivateGuard"], _auth_guard_service__WEBPACK_IMPORTED_MODULE_22__["AuthGuard"]],
            bootstrap: [_app_component__WEBPACK_IMPORTED_MODULE_8__["AppComponent"]]
        })
    ], AppModule);
    return AppModule;
}());



/***/ }),

/***/ "./src/app/auth-guard.service.ts":
/*!***************************************!*\
  !*** ./src/app/auth-guard.service.ts ***!
  \***************************************/
/*! exports provided: AuthGuard */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AuthGuard", function() { return AuthGuard; });
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm5/router.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _data_access_services_data_access_service__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ./data-access-services/data-access.service */ "./src/app/data-access-services/data-access.service.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};



var AuthGuard = /** @class */ (function () {
    function AuthGuard(dataAccessService, router) {
        this.dataAccessService = dataAccessService;
        this.router = router;
    }
    AuthGuard.prototype.canActivate = function (route, state) {
        if (this.dataAccessService.isAuthenticated()) {
            return true;
        }
        else {
            this.router.navigate(['/']);
        }
    };
    AuthGuard.prototype.canActivateChild = function (route, state) {
        return this.canActivate(route, state);
    };
    AuthGuard = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Injectable"])(),
        __metadata("design:paramtypes", [_data_access_services_data_access_service__WEBPACK_IMPORTED_MODULE_2__["DataAccessService"], _angular_router__WEBPACK_IMPORTED_MODULE_0__["Router"]])
    ], AuthGuard);
    return AuthGuard;
}());



/***/ }),

/***/ "./src/app/book-item-details/book-item-details.component.css":
/*!*******************************************************************!*\
  !*** ./src/app/book-item-details/book-item-details.component.css ***!
  \*******************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = ".star {\r\n  font-size: 1.2rem;\r\n  position: relative;\r\n  display: inline-block;\r\n  color: #d3d3d3;\r\n}\r\n.half {\r\n  position: absolute;\r\n  display: inline-block;\r\n  overflow: hidden;\r\n  color: #ff8d14;\r\n}\r\n.filled {\r\n  color: #ff8d14;\r\n}\r\n.bad {\r\n  color: #deb0b0;\r\n}\r\n.filled.bad {\r\n  color: #ff1e1e;\r\n}\r\n.description {\r\n  height: 75px\r\n}\r\n"

/***/ }),

/***/ "./src/app/book-item-details/book-item-details.component.html":
/*!********************************************************************!*\
  !*** ./src/app/book-item-details/book-item-details.component.html ***!
  \********************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<div class=\"container-fluid\">\r\n  <div class=\"row justify-content-center\">\r\n    <div [ngClass]=\"{'col-md-12':!showSameCat, 'col-md-6':(showSameCat)}\">\r\n      <div class=\"card\">\r\n        <div class=\"card-body\" style=\"margin-bottom: 20px\"><!--style=\"padding-left: 0px;padding-top: 0px\"-->\r\n          <div class=\"container-fluid\">\r\n            <div class=\"row\">\r\n              <div class=\"col-md-4\">\r\n                <img src=\"{{serverURL}}cover/{{activeBookItemDetails.id}}\"\r\n                     class=\"card-img\"/>\r\n              </div>\r\n              <div class=\"col-md-8\">\r\n                <h3>{{activeBookItemDetails.bookName}}</h3>\r\n                <ngb-rating [rate]=\"activeBookItemDetails.rating\" readonly max=\"5\">\r\n                  <ng-template let-fill=\"fill\" let-index=\"index\">\r\n              <span class=\"star\" [class.filled]=\"fill === 100\">\r\n                <span class=\"half\" [style.width.%]=\"fill\">&#9733;</span>&#9733;\r\n              </span>\r\n                  </ng-template>\r\n                </ngb-rating>\r\n                <strong class=\"text-info float-right\"\r\n                        style=\"font-size: 1.2rem\">{{activeBookItemDetails.author}}</strong>\r\n                <br>\r\n                <span class=\"text-muted float-right\">{{activeBookItemDetails.publisher}}</span>\r\n                <br>\r\n                <hr>\r\n                <span class=\"text-muted float-right\"\r\n                      style=\"font-size: 1.2rem\">item id: {{activeBookItemDetails.id}}</span>\r\n                <br>\r\n                <hr>\r\n\r\n                <form (ngSubmit)=\"onAddToCart(f)\" #f=\"ngForm\">\r\n                  <div class=\"form-row\">\r\n                    <div class=\"col-3\">\r\n                      <input type=\"number\" class=\"form-control small\" [(ngModel)]=\"orderQuantity\" name=\"quantity\"\r\n                             inputmode=\"numeric\" step=\"1\" min=\"1\" max=\"\" pattern=\"[0-9]*\" required>\r\n                    </div>\r\n                    <div class=\"col-9\">\r\n                      <button type=\"submit\" class=\"btn btn-primary btn-block\">\r\n                        <strong><i class=\"fa fa-usd\" aria-hidden=\"true\"></i> {{activeBookItemDetails.price}} <i\r\n                          class=\"fa fa-cart-plus\" aria-hidden=\"true\"></i>\r\n                        </strong>\r\n                      </button>\r\n                    </div>\r\n                  </div>\r\n                </form>\r\n                <br>\r\n              </div>\r\n            </div>\r\n            <div class=\"row\">\r\n              <div class=\"col\" [@descript]=\"state\">\r\n                <p>\r\n                  {{activeBookItemDetails.description}}\r\n                </p>\r\n              </div>\r\n              <div class=\"w-100\" style=\"margin-top: -20px; position: relative\">\r\n                <button type=\"button\"\r\n                        class=\"btn btn-light btn-block\"\r\n                        style=\"opacity: 0.8\"\r\n                        (click)=\"state=((state=='brief')?'full':'brief')\">\r\n                  <strong class=\"text-primary\" *ngIf=\"state==='brief'\">\r\n                    Full description\r\n                  </strong>\r\n                  <strong class=\"text-primary\" *ngIf=\"state==='full'\">\r\n                    Brief description\r\n                  </strong>\r\n                </button>\r\n              </div>\r\n            </div>\r\n            <div class=\"row\">\r\n              <div class=\"col-md-12\">\r\n                <!-- style=\"padding-left: 0px; padding-right: 0px\" style=\"background-image: url(http://localhost:8080/static/book.jpg)\"-->\r\n                <img src=\"{{serverURL}}static/book.jpg\" class=\"img-fluid\"\r\n                     style=\"width: 100%; height:90%; position: absolute;top: 0;left: 0; z-index: 0;\">\r\n                <div class=\"row justify-content-around\" *ngIf=\"bookItems\">\r\n                  <div class=\"col-md-6 text-white\">\r\n                    <h3>More by {{activeBookItemDetails.author}}</h3>\r\n                    <hr>\r\n                    <h4>About author</h4>\r\n                  </div>\r\n                  <div class=\"col-md-3\" *ngFor=\"let j of arr\" style=\"margin-top: 2%\">\r\n                    <app-book-item-small-card\r\n                      [activeBookItemDetails]=\"bookItems[j]\"\r\n                      (itemDetailsId)=\"changeActiveItem($event)\"></app-book-item-small-card>\r\n                  </div>\r\n                </div>\r\n              </div>\r\n            </div>\r\n          </div>\r\n        </div>\r\n      </div>\r\n    </div>\r\n    <div class=\"col-md-4\" *ngIf=\"showSameCat\">\r\n      <!--<h4 class=\"text-primary\" *ngIf=\"showSameCat\">Mor from {{activeBookItemDetails.category}} category</h4>-->\r\n      <app-book-item-midle-card *ngFor=\"let bookItem of sameCategoryBooks\"\r\n                                [activeBookItemDetails]=\"bookItem\"\r\n                                (itemDetailsId)=\"changeActiveItem($event)\"\r\n                                style=\"cursor: pointer\"></app-book-item-midle-card>\r\n\r\n    </div>\r\n  </div>\r\n\r\n</div>\r\n\r\n"

/***/ }),

/***/ "./src/app/book-item-details/book-item-details.component.ts":
/*!******************************************************************!*\
  !*** ./src/app/book-item-details/book-item-details.component.ts ***!
  \******************************************************************/
/*! exports provided: BookItemDetailsComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "BookItemDetailsComponent", function() { return BookItemDetailsComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_animations__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/animations */ "./node_modules/@angular/animations/fesm5/animations.js");
/* harmony import */ var _data_models_BookItem__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ../data-models/BookItem */ "./src/app/data-models/BookItem.ts");
/* harmony import */ var _data_access_services_data_access_service__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ../data-access-services/data-access.service */ "./src/app/data-access-services/data-access.service.ts");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm5/router.js");
/* harmony import */ var _environments_environment__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! ../../environments/environment */ "./src/environments/environment.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};






var BookItemDetailsComponent = /** @class */ (function () {
    function BookItemDetailsComponent(dataAccessService, route) {
        this.dataAccessService = dataAccessService;
        this.route = route;
        this.serverURL = _environments_environment__WEBPACK_IMPORTED_MODULE_5__["environment"].serverURL;
        this.activeBookItemDetails = new _data_models_BookItem__WEBPACK_IMPORTED_MODULE_2__["BookItem"](null, null, null, null, null, null, null, null, null, null, null);
        this.addToCart = new _angular_core__WEBPACK_IMPORTED_MODULE_0__["EventEmitter"]();
        this.showSameCat = true;
        this.routerId = this.route.snapshot.params['bookId'];
    }
    BookItemDetailsComponent.prototype.ngOnInit = function () {
        var _this = this;
        // this.showSameCat = true;
        if (this.routerId != null) {
            this.dataAccessService.getBookItemsByParam('id', this.routerId)
                .subscribe(function (response) {
                var data = response.json();
                _this.activeBookItemDetails = data.bookItems[0];
                _this.dataAccessService.getBookItemsByParam('author', _this.activeBookItemDetails.author)
                    .subscribe(function (response2) {
                    // console.log(response);
                    var data2 = response2.json();
                    _this.bookItems = data2.bookItems;
                    if (_this.bookItems.length < 2) {
                        _this.arr = Array(_this.bookItems.length).fill(0).map(function (x, i) { return i; });
                    }
                    else {
                        _this.arr = Array(2).fill(0).map(function (x, i) { return i; });
                    }
                    _this.bookItems.sort(function (a, b) {
                        if (a.rating > b.rating) {
                            return -1;
                        }
                        else if (a.rating < b.rating) {
                            return 1;
                        }
                        else {
                            return 0;
                        }
                    });
                });
                _this.dataAccessService.getBookItemsByParam('category', _this.activeBookItemDetails.category)
                    .subscribe(function (response2) {
                    // console.log(response);
                    var data2 = response2.json();
                    _this.sameCategoryBooks = data2.bookItems;
                    _this.sameCategoryBooks.sort(function (a, b) {
                        if (a.rating > b.rating) {
                            return -1;
                        }
                        else if (a.rating < b.rating) {
                            return 1;
                        }
                        else {
                            return 0;
                        }
                    });
                });
            });
        }
        this.fullDescription = false;
        this.state = 'brief';
        this.orderQuantity = 1;
    };
    BookItemDetailsComponent.prototype.ngOnChanges = function (changes) {
    };
    BookItemDetailsComponent.prototype.onAddToCart = function (form) {
        this.addToCart.emit(form.value.quantity);
        this.dataAccessService.addToCart(this.activeBookItemDetails, form.value.quantity);
        // console.log(this.dataAccessService.shoppingCart);
    };
    BookItemDetailsComponent.prototype.getFromCart = function (bookItem) {
        return this.dataAccessService.getFromCart(bookItem);
    };
    BookItemDetailsComponent.prototype.changeActiveItem = function (bookItemId) {
        var _this = this;
        this.dataAccessService.getBookItemsByParam('id', bookItemId)
            .subscribe(function (response) {
            var data = response.json();
            _this.activeBookItemDetails = data.bookItems[0];
            _this.dataAccessService.getBookItemsByParam('author', _this.activeBookItemDetails.author)
                .subscribe(function (response2) {
                // console.log(response);
                var data2 = response2.json();
                _this.bookItems = data2.bookItems;
                if (_this.bookItems.length < 2) {
                    _this.arr = Array(_this.bookItems.length).fill(0).map(function (x, i) { return i; });
                }
                else {
                    _this.arr = Array(2).fill(0).map(function (x, i) { return i; });
                }
                _this.bookItems.sort(function (a, b) {
                    if (a.rating > b.rating) {
                        return -1;
                    }
                    else if (a.rating < b.rating) {
                        return 1;
                    }
                    else {
                        return 0;
                    }
                });
            });
            _this.dataAccessService.getBookItemsByParam('category', _this.activeBookItemDetails.category)
                .subscribe(function (response2) {
                // console.log(response);
                var data2 = response2.json();
                _this.sameCategoryBooks = data2.bookItems;
                _this.sameCategoryBooks.sort(function (a, b) {
                    if (a.rating > b.rating) {
                        return -1;
                    }
                    else if (a.rating < b.rating) {
                        return 1;
                    }
                    else {
                        return 0;
                    }
                });
            });
        });
        this.fullDescription = false;
        this.state = 'brief';
        this.orderQuantity = 1;
    };
    __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Input"])(),
        __metadata("design:type", _data_models_BookItem__WEBPACK_IMPORTED_MODULE_2__["BookItem"])
    ], BookItemDetailsComponent.prototype, "activeBookItemDetails", void 0);
    __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Output"])(),
        __metadata("design:type", Object)
    ], BookItemDetailsComponent.prototype, "addToCart", void 0);
    __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Input"])(),
        __metadata("design:type", Object)
    ], BookItemDetailsComponent.prototype, "showSameCat", void 0);
    BookItemDetailsComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-book-item-details',
            template: __webpack_require__(/*! ./book-item-details.component.html */ "./src/app/book-item-details/book-item-details.component.html"),
            styles: [__webpack_require__(/*! ./book-item-details.component.css */ "./src/app/book-item-details/book-item-details.component.css")],
            animations: [
                Object(_angular_animations__WEBPACK_IMPORTED_MODULE_1__["trigger"])('descript', [
                    Object(_angular_animations__WEBPACK_IMPORTED_MODULE_1__["state"])('brief', Object(_angular_animations__WEBPACK_IMPORTED_MODULE_1__["style"])({
                        height: '75px',
                        overflow: 'hidden',
                        'text-overflow': 'ellipsis'
                    })),
                    Object(_angular_animations__WEBPACK_IMPORTED_MODULE_1__["state"])('full', Object(_angular_animations__WEBPACK_IMPORTED_MODULE_1__["style"])({})),
                    Object(_angular_animations__WEBPACK_IMPORTED_MODULE_1__["transition"])('brief <=> full', Object(_angular_animations__WEBPACK_IMPORTED_MODULE_1__["animate"])(500)),
                ])
            ]
        }),
        __metadata("design:paramtypes", [_data_access_services_data_access_service__WEBPACK_IMPORTED_MODULE_3__["DataAccessService"],
            _angular_router__WEBPACK_IMPORTED_MODULE_4__["ActivatedRoute"]])
    ], BookItemDetailsComponent);
    return BookItemDetailsComponent;
}());



/***/ }),

/***/ "./src/app/book-item-midle-card/book-item-midle-card.component.css":
/*!*************************************************************************!*\
  !*** ./src/app/book-item-midle-card/book-item-midle-card.component.css ***!
  \*************************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = ".star {\r\n  /*font-size: 1.2rem;*/\r\n  position: relative;\r\n  display: inline-block;\r\n  color: #d3d3d3;\r\n}\r\n.half {\r\n  position: absolute;\r\n  display: inline-block;\r\n  overflow: hidden;\r\n  color: #ff8d14;\r\n}\r\n.filled {\r\n  color: #ff8d14;\r\n}\r\n::ng-deep .custom-tooltip-class .tooltip-inner{\r\n  background-color: dodgerblue;\r\n  /*font-size: 125%;*/\r\n}\r\n::ng-deep .custom-tooltip-class .arrow::before {\r\n  /*border-top-color: dodgerblue;*/\r\n  border-right-color: dodgerblue;\r\n}\r\n"

/***/ }),

/***/ "./src/app/book-item-midle-card/book-item-midle-card.component.html":
/*!**************************************************************************!*\
  !*** ./src/app/book-item-midle-card/book-item-midle-card.component.html ***!
  \**************************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<div class=\"card\" (click)=\"bookDetails()\" style=\"margin-top: 4px; margin-bottom: 4px\">\r\n  <!--style=\"width: 400px; height: 200px\"-->\r\n  <div class=\"card-body\" style=\"padding-top: 0px; padding-left: 0px; padding-bottom: 0px\">\r\n    <img src=\"{{serverURL}}cover/{{activeBookItemDetails.id}}\"\r\n         width=\"35%\" align=\"left\"/>\r\n    <h4 style=\"overflow: hidden;\r\n        text-overflow: ellipsis;\r\n        white-space: nowrap\">\r\n      {{activeBookItemDetails.bookName}}\r\n    </h4>\r\n    <p>\r\n      <span class=\"text-info float-right\">{{activeBookItemDetails.author}}</span>\r\n    </p>\r\n    <br>\r\n    <p style=\"height: 80px; overflow: hidden; text-overflow: ellipsis\">\r\n      {{activeBookItemDetails.description}}\r\n    </p>\r\n    <p>\r\n      <ngb-rating [rate]=\"activeBookItemDetails.rating\" readonly max=\"5\">\r\n        <ng-template let-fill=\"fill\" let-index=\"index\">\r\n              <span class=\"star\" [class.filled]=\"fill === 100\">\r\n                <span class=\"half\" [style.width.%]=\"fill\">&#9733;</span>&#9733;\r\n              </span>\r\n        </ng-template>\r\n      </ngb-rating>\r\n      <strong\r\n        class=\"text-info float-right\"\r\n        style=\"font-size: 1rem\">\r\n        {{shoppingCartNum ? shoppingCartNum+' x ':''}}<i class=\"fa fa-usd\" aria-hidden=\"true\"></i>{{activeBookItemDetails.price}}\r\n        <i class=\"fa fa-minus-square text-danger\" aria-hidden=\"true\" style=\"cursor: pointer\"\r\n           (click)=\"deleteFromCart(activeBookItemDetails)\"\r\n            *ngIf=\"getFromCart()\"\r\n           placement=\"right\"\r\n           [ngbTooltip]=\"delFromCart\"\r\n           tooltipClass=\"custom-tooltip-class\" ></i>\r\n      </strong>\r\n      <!--<div class=\"btn-group btn-group-sm\">-->\r\n      <!--<button type=\"button\" class=\"btn btn-outline-primary btn-sm\"-->\r\n      <!--(click)=\"setItemEntryValue(entry.value+1,entry)\"-->\r\n      <!--[disabled]=\"activeOrder.status=='closed' || activeOrder.status=='processed'\">-->\r\n      <!--<i class=\"fa fa-plus-square\" aria-hidden=\"true\"></i>-->\r\n      <!--</button>-->\r\n      <!--<button type=\"button\" class=\"btn btn-outline-danger btn-sm\"-->\r\n      <!--[disabled]=\"entry.value==0 || activeOrder.status=='closed' || activeOrder.status=='processed'\"-->\r\n      <!--(click)=\"setItemEntryValue(entry.value-1,entry)\">-->\r\n      <!--<i class=\"fa fa-minus-square\" aria-hidden=\"true\"></i>-->\r\n      <!--</button>-->\r\n      <!--</div>-->\r\n      <!--<button type=\"button\" class=\"btn btn-outline-danger btn-sm\"><i class=\"fa fa-minus-square\" aria-hidden=\"true\"></i></button>-->\r\n    </p>\r\n  </div>\r\n</div>\r\n\r\n<ng-template #delFromCart>Delete from cart</ng-template>\r\n"

/***/ }),

/***/ "./src/app/book-item-midle-card/book-item-midle-card.component.ts":
/*!************************************************************************!*\
  !*** ./src/app/book-item-midle-card/book-item-midle-card.component.ts ***!
  \************************************************************************/
/*! exports provided: BookItemMidleCardComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "BookItemMidleCardComponent", function() { return BookItemMidleCardComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _data_models_BookItem__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! ../data-models/BookItem */ "./src/app/data-models/BookItem.ts");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm5/router.js");
/* harmony import */ var _data_access_services_data_access_service__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ../data-access-services/data-access.service */ "./src/app/data-access-services/data-access.service.ts");
/* harmony import */ var _environments_environment__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! ../../environments/environment */ "./src/environments/environment.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};





var BookItemMidleCardComponent = /** @class */ (function () {
    function BookItemMidleCardComponent(router, dataAccessService) {
        this.router = router;
        this.dataAccessService = dataAccessService;
        this.serverURL = _environments_environment__WEBPACK_IMPORTED_MODULE_4__["environment"].serverURL;
        this.itemDetailsId = new _angular_core__WEBPACK_IMPORTED_MODULE_0__["EventEmitter"]();
    }
    BookItemMidleCardComponent.prototype.ngOnInit = function () {
    };
    BookItemMidleCardComponent.prototype.bookDetails = function () {
        this.itemDetailsId.emit('' + this.activeBookItemDetails.id);
    };
    BookItemMidleCardComponent.prototype.deleteFromCart = function () {
        this.dataAccessService.deleteFromCart(this.activeBookItemDetails);
    };
    BookItemMidleCardComponent.prototype.getFromCart = function () {
        return this.dataAccessService.getFromCart(this.activeBookItemDetails);
    };
    __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Input"])(),
        __metadata("design:type", _data_models_BookItem__WEBPACK_IMPORTED_MODULE_1__["BookItem"])
    ], BookItemMidleCardComponent.prototype, "activeBookItemDetails", void 0);
    __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Output"])(),
        __metadata("design:type", Object)
    ], BookItemMidleCardComponent.prototype, "itemDetailsId", void 0);
    __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Input"])(),
        __metadata("design:type", Number)
    ], BookItemMidleCardComponent.prototype, "shoppingCartNum", void 0);
    BookItemMidleCardComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-book-item-midle-card',
            template: __webpack_require__(/*! ./book-item-midle-card.component.html */ "./src/app/book-item-midle-card/book-item-midle-card.component.html"),
            styles: [__webpack_require__(/*! ./book-item-midle-card.component.css */ "./src/app/book-item-midle-card/book-item-midle-card.component.css")]
        }),
        __metadata("design:paramtypes", [_angular_router__WEBPACK_IMPORTED_MODULE_2__["Router"], _data_access_services_data_access_service__WEBPACK_IMPORTED_MODULE_3__["DataAccessService"]])
    ], BookItemMidleCardComponent);
    return BookItemMidleCardComponent;
}());



/***/ }),

/***/ "./src/app/book-item-small-card/book-item-small-card.component.css":
/*!*************************************************************************!*\
  !*** ./src/app/book-item-small-card/book-item-small-card.component.css ***!
  \*************************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = ".star {\r\n  /*font-size: 1.2rem;*/\r\n  position: relative;\r\n  display: inline-block;\r\n  color: #d3d3d3;\r\n}\r\n.half {\r\n  position: absolute;\r\n  display: inline-block;\r\n  overflow: hidden;\r\n  color: #ff8d14;\r\n}\r\n.filled {\r\n  color: #ff8d14;\r\n}\r\n"

/***/ }),

/***/ "./src/app/book-item-small-card/book-item-small-card.component.html":
/*!**************************************************************************!*\
  !*** ./src/app/book-item-small-card/book-item-small-card.component.html ***!
  \**************************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<a routerLink=\"{{'/bookItem/'+activeBookItemDetails.id}}\" (click)=\"onBookClick()\">\r\n<div class=\"card\" style=\"height: 100%\" ><!--style=\"width: 150px; height: 325px\"-->\r\n  <img src=\"{{serverURL}}cover/{{activeBookItemDetails.id}}\"\r\n       class=\"card-img-top\" height=\"75%\"/>\r\n  <div class=\"card-body text-dark float-left\"\r\n       style=\"white-space: nowrap;\r\n       overflow: hidden;\r\n       text-overflow: ellipsis;\r\n       padding: 2px\">\r\n    <p>\r\n      {{activeBookItemDetails.bookName}}\r\n      <br>\r\n      <span class=\"text-info float-left\">{{activeBookItemDetails.author}}</span>\r\n      <br>\r\n      <ngb-rating [rate]=\"activeBookItemDetails.rating\" readonly max=\"5\">\r\n        <ng-template let-fill=\"fill\" let-index=\"index\">\r\n              <span class=\"star\" [class.filled]=\"fill === 100\">\r\n                <span class=\"half\" [style.width.%]=\"fill\">&#9733;</span>&#9733;\r\n              </span>\r\n        </ng-template>\r\n      </ngb-rating>\r\n      <strong class=\"text-info float-right\" style=\"font-size: 1rem\"><i class=\"fa fa-usd\" aria-hidden=\"true\"></i>{{activeBookItemDetails.price}}</strong>\r\n    </p>\r\n  </div>\r\n</div>\r\n</a>\r\n"

/***/ }),

/***/ "./src/app/book-item-small-card/book-item-small-card.component.ts":
/*!************************************************************************!*\
  !*** ./src/app/book-item-small-card/book-item-small-card.component.ts ***!
  \************************************************************************/
/*! exports provided: BookItemSmallCardComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "BookItemSmallCardComponent", function() { return BookItemSmallCardComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _data_models_BookItem__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! ../data-models/BookItem */ "./src/app/data-models/BookItem.ts");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm5/router.js");
/* harmony import */ var _data_access_services_data_access_service__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ../data-access-services/data-access.service */ "./src/app/data-access-services/data-access.service.ts");
/* harmony import */ var _environments_environment__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! ../../environments/environment */ "./src/environments/environment.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};





var BookItemSmallCardComponent = /** @class */ (function () {
    function BookItemSmallCardComponent(router, dataAccessService) {
        this.router = router;
        this.dataAccessService = dataAccessService;
        this.serverURL = _environments_environment__WEBPACK_IMPORTED_MODULE_4__["environment"].serverURL;
        this.itemDetailsId = new _angular_core__WEBPACK_IMPORTED_MODULE_0__["EventEmitter"]();
    }
    BookItemSmallCardComponent.prototype.ngOnInit = function () {
        // this.activeBookItemDetails = this.dataAccessService.bookItems[0];
    };
    BookItemSmallCardComponent.prototype.ngOnChanges = function (changes) {
        // console.log(changes);
    };
    BookItemSmallCardComponent.prototype.onBookClick = function () {
        this.itemDetailsId.emit('' + this.activeBookItemDetails.id);
    };
    __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Input"])(),
        __metadata("design:type", _data_models_BookItem__WEBPACK_IMPORTED_MODULE_1__["BookItem"])
    ], BookItemSmallCardComponent.prototype, "activeBookItemDetails", void 0);
    __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Output"])(),
        __metadata("design:type", Object)
    ], BookItemSmallCardComponent.prototype, "itemDetailsId", void 0);
    BookItemSmallCardComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-book-item-small-card',
            template: __webpack_require__(/*! ./book-item-small-card.component.html */ "./src/app/book-item-small-card/book-item-small-card.component.html"),
            styles: [__webpack_require__(/*! ./book-item-small-card.component.css */ "./src/app/book-item-small-card/book-item-small-card.component.css")]
        }),
        __metadata("design:paramtypes", [_angular_router__WEBPACK_IMPORTED_MODULE_2__["Router"], _data_access_services_data_access_service__WEBPACK_IMPORTED_MODULE_3__["DataAccessService"]])
    ], BookItemSmallCardComponent);
    return BookItemSmallCardComponent;
}());



/***/ }),

/***/ "./src/app/can-deactivate-guard.service.ts":
/*!*************************************************!*\
  !*** ./src/app/can-deactivate-guard.service.ts ***!
  \*************************************************/
/*! exports provided: CanDeactivateGuard */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "CanDeactivateGuard", function() { return CanDeactivateGuard; });
var CanDeactivateGuard = /** @class */ (function () {
    function CanDeactivateGuard() {
    }
    CanDeactivateGuard.prototype.canDeactivate = function (component, currentRoute, currentState, nextState) {
        return component.canDeactivate();
    };
    return CanDeactivateGuard;
}());



/***/ }),

/***/ "./src/app/data-access-services/data-access.service.ts":
/*!*************************************************************!*\
  !*** ./src/app/data-access-services/data-access.service.ts ***!
  \*************************************************************/
/*! exports provided: DataAccessService */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "DataAccessService", function() { return DataAccessService; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _data_models_User__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! ../data-models/User */ "./src/app/data-models/User.ts");
/* harmony import */ var _angular_http__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/http */ "./node_modules/@angular/http/fesm5/http.js");
/* harmony import */ var rxjs__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! rxjs */ "./node_modules/rxjs/_esm5/index.js");
/* harmony import */ var rxjs_operators__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! rxjs/operators */ "./node_modules/rxjs/_esm5/operators/index.js");
/* harmony import */ var _data_models_ItemEntry__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! ../data-models/ItemEntry */ "./src/app/data-models/ItemEntry.ts");
/* harmony import */ var _environments_environment__WEBPACK_IMPORTED_MODULE_6__ = __webpack_require__(/*! ../../environments/environment */ "./src/environments/environment.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};







var DataAccessService = /** @class */ (function () {
    function DataAccessService(http) {
        this.http = http;
        this.serverURL = _environments_environment__WEBPACK_IMPORTED_MODULE_6__["environment"].serverURL;
        this.usersChanged = new rxjs__WEBPACK_IMPORTED_MODULE_3__["Subject"]();
        this.totalUserCountChanged = new rxjs__WEBPACK_IMPORTED_MODULE_3__["Subject"]();
        this.userDetailsOrdersChanged = new rxjs__WEBPACK_IMPORTED_MODULE_3__["Subject"]();
        this.totalUnProcessedOrdersChanged = new rxjs__WEBPACK_IMPORTED_MODULE_3__["Subject"]();
        this.ordersChanged = new rxjs__WEBPACK_IMPORTED_MODULE_3__["Subject"]();
        this.totalOrderCountChanged = new rxjs__WEBPACK_IMPORTED_MODULE_3__["Subject"]();
        this.bookItemsChanged = new rxjs__WEBPACK_IMPORTED_MODULE_3__["Subject"]();
        this.totalBookItemCountChanged = new rxjs__WEBPACK_IMPORTED_MODULE_3__["Subject"]();
        // storageBooksChanged = new Subject<StorageBooks>();
        this.USDUAH = new rxjs__WEBPACK_IMPORTED_MODULE_3__["Subject"]();
        this.EURUAH = new rxjs__WEBPACK_IMPORTED_MODULE_3__["Subject"]();
        this.RUBUAH = new rxjs__WEBPACK_IMPORTED_MODULE_3__["Subject"]();
        this.totalShoppingCartSumChanged = new rxjs__WEBPACK_IMPORTED_MODULE_3__["Subject"]();
        this.loggedUserOrdersChanged = new rxjs__WEBPACK_IMPORTED_MODULE_3__["Subject"]();
        this.loggedUserChanged = new rxjs__WEBPACK_IMPORTED_MODULE_3__["Subject"]();
        this.activeFilters = new Map();
        this.activeFiltersChanged = new rxjs__WEBPACK_IMPORTED_MODULE_3__["Subject"]();
        this.totalUserCount = 12;
        this.users = [new _data_models_User__WEBPACK_IMPORTED_MODULE_1__["User"](100500, 'login1', 'email1', '111-000', 'adress1', 'name1', 'lastname1', 'CUSTOMER', 'group1', 'avatarUrl'),
            new _data_models_User__WEBPACK_IMPORTED_MODULE_1__["User"](100500, 'login2', 'email1', '111-000', 'adress2', 'name2', 'lastname2', 'CUSTOMER', 'group2', 'avatarUrl')];
        this.userDetailsId = -1;
        this.getBookItems(this.serverURL + 'bookItems');
        this.getTotalBookItemsCount();
        this.shoppingCart = [];
        this.totalShoppingCartSum = 0;
    }
    DataAccessService.prototype.getUserDetailsOrders2 = function (reqUrl) {
        console.log(reqUrl + '  get user orders!!!!!!!!');
        return this.http.get(reqUrl).pipe(Object(rxjs_operators__WEBPACK_IMPORTED_MODULE_4__["map"])(function (response) {
            console.log(response + '  get orders');
            var orders = response.json();
            return orders;
        }));
    };
    DataAccessService.prototype.getUsers = function () {
        console.log(this.users.slice() + 'from get users');
        return this.users.slice();
    };
    DataAccessService.prototype.setUsers = function (value) {
        this.users = value;
        console.log('from set users ' + value);
        this.usersChanged.next(this.users.slice());
    };
    DataAccessService.prototype.getTotalUserCount = function () {
        return this.totalUserCount;
    };
    DataAccessService.prototype.setTotalUserCount = function (value) {
        this.totalUserCount = value;
        console.log('from set totalUserCount ' + value);
        this.totalUserCountChanged.next(this.totalUserCount);
    };
    DataAccessService.prototype.saveOrder = function (orderToSave) {
        return this.http.post(this.serverURL + 'saveOrder', orderToSave);
    };
    DataAccessService.prototype.getBookItems = function (reqUrl) {
        var _this = this;
        this.http.get(reqUrl).subscribe(function (response) {
            console.log(response + ' from get books!!!!!!!!!!!!!!!!!!!!!!!!');
            var data = response.json();
            _this.bookItems = data;
            _this.bookItemsChanged.next(_this.bookItems);
        });
    };
    DataAccessService.prototype.getBookItems2 = function (reqUrl) {
        return this.http.get(reqUrl);
    };
    DataAccessService.prototype.getBookItemsByParam = function (paramName, paramValue) {
        return this.http.get(this.serverURL + 'bookItemsByParam?' + paramName + '=' + paramValue);
    };
    DataAccessService.prototype.getBookItemsByParam2 = function (filters, sortBy, itemsPerPage, page, changeSortDirect) {
        var _this = this;
        var reqUrl = this.serverURL + 'bookItemsByParam?';
        for (var _i = 0, _a = Array.from(filters.keys()); _i < _a.length; _i++) {
            var key = _a[_i];
            for (var j = 0; j < filters.get(key).length; j++) {
                reqUrl = reqUrl + key + '=' + filters.get(key)[j] + '&';
            }
        }
        reqUrl = reqUrl + 'sortBy=' + sortBy + '&itemsPerPage=' + itemsPerPage
            + '&page=' + page + '&changeSortDirect=' + changeSortDirect;
        console.log(reqUrl);
        this.http.get(reqUrl).subscribe(function (response) {
            var data = response.json();
            _this.bookItems = data.bookItems;
            _this.totalBookItemCount = data.totalCountByParam;
            _this.bookItemsChanged.next(_this.bookItems);
            _this.totalBookItemCountChanged.next(_this.totalBookItemCount);
        });
    };
    DataAccessService.prototype.getTotalBookItemsCount = function () {
        var _this = this;
        this.http.get(this.serverURL + 'bookCount').subscribe(function (responce) {
            var data = responce.json();
            _this.totalBookItemCount = data;
            _this.totalBookItemCountChanged.next(_this.totalBookItemCount);
        });
    };
    DataAccessService.prototype.createNewUser = function (data) {
        return this.http.post(this.serverURL + 'createNewUser', data);
    };
    DataAccessService.prototype.login = function (data) {
        var _this = this;
        this.http.post(this.serverURL + 'signin', data).subscribe(function (response) {
            // console.log(response);
            if (response.status === 200) {
                var serverReply = response.json();
                _this.accessToken = serverReply.accessToken;
                _this.authHeader = new _angular_http__WEBPACK_IMPORTED_MODULE_2__["Headers"]({ 'Authorization': 'Bearer ' + _this.accessToken });
                var header = new _angular_http__WEBPACK_IMPORTED_MODULE_2__["Headers"]({ 'Authorization': _this.accessToken });
                _this.http.get(_this.serverURL + 'userInfo?login=' + data.login, { headers: header }).subscribe(function (response2) {
                    if (response2.status === 200) {
                        var serverReply2 = response2.json();
                        _this.loggedUser = serverReply2.clientDTO;
                        _this.loggedUserOrders = serverReply2.clientOrders;
                        _this.loggedUserChanged.next(_this.loggedUser);
                        _this.loggedUserOrdersChanged.next(_this.loggedUserOrders);
                    }
                });
            }
            else {
                _this.serverReply = 'wrong login or password';
            }
        });
    };
    DataAccessService.prototype.logout = function () {
        this.loggedUser = null;
        this.loggedUserOrders = null;
        this.loggedUserChanged.next(this.loggedUser);
        this.loggedUserOrdersChanged.next(this.loggedUserOrders);
    };
    DataAccessService.prototype.isAuthenticated = function () {
        if (this.loggedUser != null) {
            return true;
        }
        else {
            return false;
        }
    };
    DataAccessService.prototype.goToAdminPage = function () {
        this.http.get(this.serverURL + 'adminPage').subscribe();
    };
    DataAccessService.prototype.submitOrder = function (data) {
        return this.http.post(this.serverURL + 'submitOrder', data);
    };
    DataAccessService.prototype.createNewOrder = function () {
        return this.http.get(this.serverURL + 'createNewOrder');
    };
    DataAccessService.prototype.countOrdersByParam = function (paramName, paramValue) {
        return this.http.get(this.serverURL + 'countOrdersByParam?paramName='
            + paramName + '&paramValue=' + paramValue);
    };
    DataAccessService.prototype.getAllOrders = function () {
        return this.http.get(this.serverURL + 'orders?allOrders=true');
    };
    DataAccessService.prototype.getRates = function () {
        var _this = this;
        return this.http.get(this.serverURL + 'rates')
            .subscribe(function (responce) {
            var data = responce.json();
            _this.USDUAH.next(Math.round(data.quotes.USDUAH * 1000) / 1000);
            _this.EURUAH.next(Math.round(data.quotes.USDUAH / data.quotes.USDEUR * 1000) / 1000);
            _this.RUBUAH.next(Math.round(data.quotes.USDUAH / data.quotes.USDRUB * 1000) / 1000);
        });
    };
    DataAccessService.prototype.getTasks = function () {
        return this.http.get(this.serverURL + 'getTasks');
    };
    DataAccessService.prototype.updateTask = function (task) {
        this.http.post(this.serverURL + 'tasks', task).subscribe(function (response) {
            console.log(response);
        });
    };
    DataAccessService.prototype.deleteTasks = function (task) {
        task.status = 'closed';
        return this.http.post(this.serverURL + 'tasks', task);
    };
    DataAccessService.prototype.deleteUser = function (userId) {
        return this.http.get(this.serverURL + 'deleteUser?userId=' + userId);
    };
    DataAccessService.prototype.saveBookItem = function (bookToSave) {
        return this.http.post(this.serverURL + 'saveBookItem', bookToSave);
    };
    DataAccessService.prototype.deleteBookItem = function (bookItemId) {
        return this.http.post(this.serverURL + 'saveBookItem', bookItemId);
    };
    DataAccessService.prototype.createNewBookItem = function (data) {
        return this.http.post(this.serverURL + 'createNewBookItem', data);
    };
    DataAccessService.prototype.getBookParameters = function () {
        return this.http.get(this.serverURL + 'getBookParameters');
    };
    DataAccessService.prototype.addToCart = function (bookItem, quantity) {
        var num = 0;
        var shopSum = 0;
        for (var _i = 0, _a = this.shoppingCart; _i < _a.length; _i++) {
            var itemEntry = _a[_i];
            if (itemEntry.key.id === bookItem.id) {
                itemEntry.value = itemEntry.value + quantity;
                num = 1;
                break;
            }
        }
        if (num === 0) {
            this.shoppingCart.push(new _data_models_ItemEntry__WEBPACK_IMPORTED_MODULE_5__["ItemEntry"](bookItem, quantity));
        }
        for (var _b = 0, _c = this.shoppingCart; _b < _c.length; _b++) {
            var itemEntry = _c[_b];
            shopSum = shopSum + itemEntry.key.price * itemEntry.value;
        }
        this.totalShoppingCartSum = Math.floor(shopSum * 100) / 100;
        this.totalShoppingCartSumChanged.next(this.totalShoppingCartSum);
    };
    DataAccessService.prototype.deleteFromCart = function (bookItem) {
        var ind = -1;
        var shopSum = 0;
        for (var i = 0; i < this.shoppingCart.length; i++) {
            if (this.shoppingCart[i].key.id === bookItem.id) {
                this.shoppingCart[i].value--;
                if (this.shoppingCart[i].value <= 0) {
                    ind = i;
                    break;
                }
            }
        }
        if (ind !== -1) {
            this.shoppingCart.splice(ind, 1);
        }
        for (var _i = 0, _a = this.shoppingCart; _i < _a.length; _i++) {
            var itemEntry = _a[_i];
            shopSum = shopSum + itemEntry.key.price * itemEntry.value;
        }
        this.totalShoppingCartSum = Math.floor(shopSum * 100) / 100;
        this.totalShoppingCartSumChanged.next(this.totalShoppingCartSum);
    };
    DataAccessService.prototype.getFromCart = function (bookItem) {
        for (var _i = 0, _a = this.shoppingCart; _i < _a.length; _i++) {
            var itemEntry = _a[_i];
            if (itemEntry.key.id === bookItem.id) {
                return itemEntry.value;
            }
        }
        return null;
    };
    DataAccessService = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Injectable"])(),
        __metadata("design:paramtypes", [_angular_http__WEBPACK_IMPORTED_MODULE_2__["Http"]])
    ], DataAccessService);
    return DataAccessService;
}());



/***/ }),

/***/ "./src/app/data-models/BookItem.ts":
/*!*****************************************!*\
  !*** ./src/app/data-models/BookItem.ts ***!
  \*****************************************/
/*! exports provided: BookItem */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "BookItem", function() { return BookItem; });
var BookItem = /** @class */ (function () {
    function BookItem(id, bookName, description, author, publisher, category, price, storageBooks, raiting, ISBN, copiesInStock) {
        this.id = id;
        this.bookName = bookName;
        this.description = description;
        this.author = author;
        this.publisher = publisher;
        this.category = category;
        this.price = price;
        this.storageBooks = storageBooks;
        this.rating = raiting;
        this.isbn = ISBN;
        this.copiesInStock = copiesInStock;
    }
    return BookItem;
}());



/***/ }),

/***/ "./src/app/data-models/ItemEntry.ts":
/*!******************************************!*\
  !*** ./src/app/data-models/ItemEntry.ts ***!
  \******************************************/
/*! exports provided: ItemEntry */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "ItemEntry", function() { return ItemEntry; });
var ItemEntry = /** @class */ (function () {
    function ItemEntry(key, value) {
        this.key = key;
        this.value = value;
    }
    return ItemEntry;
}());



/***/ }),

/***/ "./src/app/data-models/Order.ts":
/*!**************************************!*\
  !*** ./src/app/data-models/Order.ts ***!
  \**************************************/
/*! exports provided: Order */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "Order", function() { return Order; });
var Order = /** @class */ (function () {
    function Order(orderSet, orderPrice, client, shipment, status, orderDate) {
        this.orderList = orderSet;
        this.orderPrice = orderPrice;
        this.client = client;
        this.shipment = shipment;
        this.status = status;
        this.orderDate = orderDate;
    }
    return Order;
}());



/***/ }),

/***/ "./src/app/data-models/Shipment2.ts":
/*!******************************************!*\
  !*** ./src/app/data-models/Shipment2.ts ***!
  \******************************************/
/*! exports provided: Shipment2 */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "Shipment2", function() { return Shipment2; });
var Shipment2 = /** @class */ (function () {
    function Shipment2(id, shippingAddress, shipmentStatus, order) {
        this.id = id;
        this.shippingAddress = shippingAddress;
        this.shipmentStatus = shipmentStatus;
        this.order = order;
    }
    return Shipment2;
}());



/***/ }),

/***/ "./src/app/data-models/User.ts":
/*!*************************************!*\
  !*** ./src/app/data-models/User.ts ***!
  \*************************************/
/*! exports provided: User */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "User", function() { return User; });
var User = /** @class */ (function () {
    function User(id, login, email, phone, adress, name, lastname, role, clientGroup, avatar) {
        this.id = id;
        this.login = login;
        this.email = email;
        this.phone = phone;
        this.adress = adress;
        this.name = name;
        this.lastname = lastname;
        this.role = role;
        this.clientGroup = clientGroup;
        this.avatar = avatar;
        console.log('user constructor ' + id);
    }
    return User;
}());



/***/ }),

/***/ "./src/app/home/book-item-line/book-item-line.component.css":
/*!******************************************************************!*\
  !*** ./src/app/home/book-item-line/book-item-line.component.css ***!
  \******************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = ""

/***/ }),

/***/ "./src/app/home/book-item-line/book-item-line.component.html":
/*!*******************************************************************!*\
  !*** ./src/app/home/book-item-line/book-item-line.component.html ***!
  \*******************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<div class=\"row\">\r\n  <div class=\"col\">\r\n    <br>\r\n    <strong class=\"text-primary\" style=\"font-size: 1.2rem\">Popular books</strong>\r\n  </div>\r\n</div>\r\n<div class=\"row justify-content-around\" style=\"padding-top: 10px\">\r\n  <div class=\"col-md-2\"  *ngFor=\"let bookItem of bookItems, let i=index\">\r\n    <app-book-item-small-card\r\n      [activeBookItemDetails]=\"bookItem\" style=\"cursor: pointer\"></app-book-item-small-card>\r\n  </div>\r\n</div>\r\n\r\n\r\n"

/***/ }),

/***/ "./src/app/home/book-item-line/book-item-line.component.ts":
/*!*****************************************************************!*\
  !*** ./src/app/home/book-item-line/book-item-line.component.ts ***!
  \*****************************************************************/
/*! exports provided: BookItemLineComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "BookItemLineComponent", function() { return BookItemLineComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _data_access_services_data_access_service__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! ../../data-access-services/data-access.service */ "./src/app/data-access-services/data-access.service.ts");
/* harmony import */ var _environments_environment__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ../../../environments/environment */ "./src/environments/environment.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};



var BookItemLineComponent = /** @class */ (function () {
    function BookItemLineComponent(dataAccessService) {
        this.dataAccessService = dataAccessService;
        this.serverURL = _environments_environment__WEBPACK_IMPORTED_MODULE_2__["environment"].serverURL;
        this.totalBookCount = 12;
    }
    BookItemLineComponent.prototype.ngOnInit = function () {
        var _this = this;
        this.subscriptionTotalBookItemCount = this.dataAccessService.totalBookItemCountChanged
            .subscribe(function (count) {
            _this.totalBookCount = count;
            _this.paginationArr = Array((_this.totalBookCount % _this.itemsPerPage) === 0 ?
                Math.floor(_this.totalBookCount / _this.itemsPerPage) : Math.floor(_this.totalBookCount / _this.itemsPerPage) + 1)
                .fill(0).map(function (x, i) { return i; });
        });
        this.dataAccessService.getBookItems2(this.serverURL + 'bookItems?sortBy=rating&page=1&sortDirect=DESC')
            .subscribe(function (response) {
            var data = response.json();
            _this.bookItems = data;
        });
        this.dataAccessService.getTotalBookItemsCount();
        this.currentPage = 1;
        this.sortBy = 'id';
        this.changeSortDirect = false;
        this.url = this.serverURL + 'bookItems?sortBy=' + this.sortBy
            + '&changeSortDirect=' + true + '&page=' + this.currentPage;
        this.itemsPerPage = 6;
    };
    BookItemLineComponent.prototype.ngOnChanges = function (changes) {
        // this.sortBookItems(this.sortBy);
    };
    BookItemLineComponent.prototype.sortBookItems = function (sortParam) {
        if (sortParam === 'category') {
            this.bookItems.sort(function (a, b) {
                if (a.category > b.category) {
                    return -1;
                }
                else if (a.category < b.category) {
                    return 1;
                }
                else {
                    if (a.rating > b.rating) {
                        return -1;
                    }
                    else if (a.rating < b.rating) {
                        return 1;
                    }
                    else {
                        return 0;
                    }
                }
            });
        }
        else if (sortParam === 'author') {
            this.bookItems.sort(function (a, b) {
                if (a.author > b.author) {
                    return -1;
                }
                else if (a.author < b.author) {
                    return 1;
                }
                else {
                    if (a.rating > b.rating) {
                        return -1;
                    }
                    else if (a.rating < b.rating) {
                        return 1;
                    }
                    else {
                        return 0;
                    }
                }
            });
        }
        else if (sortParam === 'publisher') {
            this.bookItems.sort(function (a, b) {
                if (a.publisher > b.publisher) {
                    return -1;
                }
                else if (a.publisher < b.publisher) {
                    return 1;
                }
                else {
                    if (a.rating > b.rating) {
                        return -1;
                    }
                    else if (a.rating < b.rating) {
                        return 1;
                    }
                    else {
                        return 0;
                    }
                }
            });
        }
        else {
            this.bookItems.sort(function (a, b) {
                if (a.rating > b.rating) {
                    return -1;
                }
                else if (a.rating < b.rating) {
                    return 1;
                }
                else {
                    return 0;
                }
            });
        }
    };
    BookItemLineComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-book-item-line',
            template: __webpack_require__(/*! ./book-item-line.component.html */ "./src/app/home/book-item-line/book-item-line.component.html"),
            styles: [__webpack_require__(/*! ./book-item-line.component.css */ "./src/app/home/book-item-line/book-item-line.component.css")]
        }),
        __metadata("design:paramtypes", [_data_access_services_data_access_service__WEBPACK_IMPORTED_MODULE_1__["DataAccessService"]])
    ], BookItemLineComponent);
    return BookItemLineComponent;
}());



/***/ }),

/***/ "./src/app/home/home.component.css":
/*!*****************************************!*\
  !*** ./src/app/home/home.component.css ***!
  \*****************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "::ng-deep .custom-tooltip-class .tooltip-inner{\r\n  background-color: dodgerblue;\r\n  /*font-size: 125%;*/\r\n}\r\n::ng-deep .custom-tooltip-class .arrow::before {\r\n  /*border-top-color: dodgerblue;*/\r\n  border-right-color: dodgerblue;\r\n}\r\n"

/***/ }),

/***/ "./src/app/home/home.component.html":
/*!******************************************!*\
  !*** ./src/app/home/home.component.html ***!
  \******************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<div class=\"container-fluid\">\r\n\r\n  <div class=\"row\">\r\n\r\n    <div class=\"col-md-12\">\r\n      <app-book-item-line></app-book-item-line>\r\n    </div>\r\n\r\n  </div>\r\n\r\n  <div class=\"row\">\r\n    <div class=\"col-md-12\">\r\n      <hr>\r\n    </div>\r\n  </div>\r\n\r\n  <div class=\"row justify-content-start\" style=\"margin-top: 10px\">\r\n    <div class=\"col-md-3\">\r\n      <form (ngSubmit)=\"sortBooks(f)\" #f=\"ngForm\">\r\n        <div class=\"form-row\">\r\n\r\n          <div class=\"col-md-10\">\r\n            <select\r\n              id=\"sortBy\"\r\n              class=\"form-control\"\r\n              [ngModel]=\"sortBy\"\r\n              name=\"sortBy\">\r\n              <option selected value=\"author\">Author</option>\r\n              <option value=\"bookName\">Book name</option>\r\n              <option value=\"rating\">Rating</option>\r\n              <option value=\"publisher\">Publisher</option>\r\n              <option value=\"category\">Category</option>\r\n            </select>\r\n          </div>\r\n\r\n          <div class=\"col-md-2\">\r\n            <button type=\"submit\" class=\"btn btn-primary\">\r\n              <i class=\"fa fa-arrows-v\" aria-hidden=\"true\"></i> sort\r\n            </button>\r\n          </div>\r\n        </div>\r\n      </form>\r\n    </div>\r\n    <div class=\"col-md-1\"></div>\r\n    <div class=\"col-md-8\">\r\n      <button type=\"button\" class=\"btn btn-light\"><strong class=\"text-primary\">Active filters: </strong></button>\r\n      <button type=\"button\"\r\n              class=\"btn btn-light\"\r\n              *ngFor=\"let key of activeFiltersArr\"\r\n              (click)=\"deleteFromFilter(key)\">\r\n        <strong class=\"text-primary\">{{key}}:{{activeFilters.get(key).toString()}}\r\n          <i class=\"fa fa-minus-square text-danger\"\r\n             aria-hidden=\"true\"\r\n             placement=\"right\"\r\n             [ngbTooltip]=\"delFromFilter\"\r\n             tooltipClass=\"custom-tooltip-class\"></i>\r\n        </strong>\r\n\r\n      </button>\r\n    </div>\r\n\r\n  </div>\r\n  <div class=\"row\">\r\n    <div class=\"col-md-12\">\r\n      <hr>\r\n    </div>\r\n  </div>\r\n\r\n  <div class=\"row \" style=\"padding-top: 10px\" *ngIf=\"arr1.length>0\">\r\n    <div class=\"col-md-2 justify-content-start\" *ngFor=\"let num of arr1, let i=index\">\r\n      <app-book-item-small-card\r\n        [activeBookItemDetails]=\"bookItems[num]\"></app-book-item-small-card>\r\n    </div>\r\n  </div>\r\n  <div class=\"row \" style=\"padding-top: 10px\" *ngIf=\"arr2.length>0\">\r\n    <div class=\"col-md-2 justify-content-start\" *ngFor=\"let num of arr2, let i=index\">\r\n      <app-book-item-small-card\r\n        [activeBookItemDetails]=\"bookItems[num]\"></app-book-item-small-card>\r\n    </div>\r\n  </div>\r\n\r\n  <div class=\"row justify-content-start\" style=\"margin-top: 10px\">\r\n    <nav aria-label=\"tablePagination\">\r\n      <ul class=\"pagination\">\r\n        <li class=\"page-item\" [ngClass]=\"{disabled: currentPage==1}\">\r\n          <a class=\"page-link\" (click)=\"changeSortDirect=false;onSortGet(sortBy,currentPage-1)\">Previous</a>\r\n        </li>\r\n        <li *ngFor=\"let int of paginationArr\"\r\n            class=\"page-item\" [ngClass]=\"{active: currentPage==(int+1)}\">\r\n          <a class=\"page-link\" (click)=\"changeSortDirect=false;onSortGet(sortBy,int+1)\">{{int+1}}</a>\r\n        </li>\r\n        <li class=\"page-item\" [ngClass]=\"{disabled: currentPage==paginationArr.length}\">\r\n          <a class=\"page-link\" (click)=\"changeSortDirect=false;onSortGet(sortBy,currentPage+1)\">Next</a>\r\n        </li>\r\n      </ul>\r\n    </nav>\r\n  </div>\r\n\r\n\r\n</div>\r\n<ng-template #delFromFilter>Delete from cart</ng-template>\r\n"

/***/ }),

/***/ "./src/app/home/home.component.ts":
/*!****************************************!*\
  !*** ./src/app/home/home.component.ts ***!
  \****************************************/
/*! exports provided: HomeComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "HomeComponent", function() { return HomeComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _data_models_BookItem__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! ../data-models/BookItem */ "./src/app/data-models/BookItem.ts");
/* harmony import */ var _data_access_services_data_access_service__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ../data-access-services/data-access.service */ "./src/app/data-access-services/data-access.service.ts");
/* harmony import */ var _environments_environment__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ../../environments/environment */ "./src/environments/environment.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};




var HomeComponent = /** @class */ (function () {
    function HomeComponent(dataAccessService) {
        this.dataAccessService = dataAccessService;
        this.serverURL = _environments_environment__WEBPACK_IMPORTED_MODULE_3__["environment"].serverURL;
        this.bookItems = [new _data_models_BookItem__WEBPACK_IMPORTED_MODULE_1__["BookItem"](null, null, null, null, null, null, null, null, null, null, null)];
        this.paginationArr = [1];
        this.activeBook = this.bookItems[0];
        this.changedBooksId = [-1];
        this.arr1 = [];
        this.arr2 = [];
        this.activeFilters = new Map();
        this.activeFiltersArr = [];
    }
    HomeComponent.prototype.ngOnInit = function () {
        var _this = this;
        this.changeSortDirect = true;
        this.itemsPerPage = 12;
        this.subscritionActiveFilters = this.dataAccessService.activeFiltersChanged
            .subscribe(function (filters) {
            _this.activeFilters = filters;
            _this.activeFiltersArr = Array.from(_this.activeFilters.keys());
            if (_this.activeFilters.size !== 0) {
                _this.dataAccessService.getBookItemsByParam2(_this.activeFilters, _this.sortBy, _this.itemsPerPage, _this.currentPage, _this.changeSortDirect);
            }
        });
        this.subscriptionBookItems = this.dataAccessService.bookItemsChanged.subscribe(function (bookItems1) {
            _this.bookItems = bookItems1;
            _this.activeBook = bookItems1[0];
            _this.arr1 = Array(((_this.bookItems.length - 6) >= 0) ? 6 : _this.bookItems.length).fill(0).map(function (x, i) { return i; });
            _this.arr2 = Array((_this.bookItems.length === 12) ? 6
                : (((_this.bookItems.length - 6) < 0) ? 0 : (_this.bookItems.length - 6))).fill(0).map(function (x, i) { return (i + 6); });
        });
        this.subscriptionTotalBookItemCount = this.dataAccessService.totalBookItemCountChanged
            .subscribe(function (count) {
            _this.totalBookCount = count;
            _this.paginationArr = Array((_this.totalBookCount % _this.itemsPerPage) === 0 ?
                Math.floor(_this.totalBookCount / _this.itemsPerPage) : Math.floor(_this.totalBookCount / _this.itemsPerPage) + 1)
                .fill(0).map(function (x, i) { return i; });
        });
        this.currentPage = 1;
        this.sortBy = 'author';
        this.changeSortDirect = false;
        this.url = this.serverURL + 'bookItems?sortBy=' + this.sortBy
            + '&changeSortDirect=' + true + '&page=' + this.currentPage + '&itemsPerPage=' + this.itemsPerPage;
        this.activeRow = -1;
        this.activeBookId = 0;
        this.dataAccessService.getTotalBookItemsCount();
        this.dataAccessService.getBookItems(this.url);
        /*this.serverURL+'bookItems?page=1&itemsPerPage=12&sortBy=author'*/
    };
    HomeComponent.prototype.onSortGet = function (sortBy, page) {
        if (this.activeFilters.size !== 0) {
            this.dataAccessService.getBookItemsByParam2(this.activeFilters, sortBy, this.itemsPerPage, page, this.changeSortDirect);
            this.sortBy = sortBy;
            this.currentPage = page;
            this.changeSortDirect = !this.changeSortDirect;
        }
        else {
            this.sortBy = sortBy;
            this.currentPage = page;
            this.url = this.serverURL + 'bookItems?sortBy=' + this.sortBy
                + '&changeSortDirect=' + this.changeSortDirect + '&page=' + this.currentPage + '&itemsPerPage=' + this.itemsPerPage;
            console.log(this.url);
            this.dataAccessService.getBookItems(this.url);
            this.dataAccessService.getTotalBookItemsCount();
            // this.changeSortDirect = !this.changeSortDirect;
        }
    };
    HomeComponent.prototype.setActiveRow = function (index1, bookId) {
        this.activeRow = index1;
        this.activeBookId = bookId;
        for (var _i = 0, _a = this.bookItems; _i < _a.length; _i++) {
            var book = _a[_i];
            if (book.id === bookId) {
                this.activeBook = book;
                // console.log(this.activeOrder.orderList[0]);
            }
        }
    };
    HomeComponent.prototype.setChangedBooksId = function (id) {
        if (this.changedBooksId.indexOf(id) === -1) {
            this.changedBooksId.push(id);
        }
    };
    HomeComponent.prototype.isBookChanged = function (id) {
        for (var _i = 0, _a = this.changedBooksId; _i < _a.length; _i++) {
            var num = _a[_i];
            if (num === id) {
                return true;
            }
        }
        return false;
    };
    HomeComponent.prototype.onSaveBookItem = function (bookToSave) {
        this.dataAccessService.saveBookItem(bookToSave).subscribe(function (response) {
            console.log(response);
            // if (response.status === 200) {
            //   // this.isModalActive = true;
            // }
        });
        this.changedBooksId.splice(this.changedBooksId.indexOf(bookToSave.id), 1);
        console.log(this.changedBooksId);
    };
    HomeComponent.prototype.closeModal = function () {
        // this.isModalActive = false;
    };
    HomeComponent.prototype.canDeactivate = function () {
        if (this.changedBooksId.length >= 2) {
            return confirm('Do you want discard changes?');
        }
        return true;
    };
    HomeComponent.prototype.deleteBookItem = function (bookToDelete) {
        if (confirm('Delete book' + bookToDelete.id)) {
            for (var i = 0; i < this.bookItems.length; i++) {
                if (this.bookItems[i].id === bookToDelete.id) {
                    this.bookItems.splice(i, 1);
                    this.dataAccessService.deleteBookItem(bookToDelete.id).subscribe(function (response) {
                        console.log(response);
                        if (response.status === 200) {
                            // this.isDeleteModalActive = true;
                        }
                    });
                }
            }
        }
    };
    HomeComponent.prototype.saveAllChanges = function () {
        for (var i = 0; i < this.bookItems.length; i++) {
            for (var j = 0; j < this.changedBooksId.length; j++) {
                if (this.bookItems[i].id === this.changedBooksId[j]) {
                    this.onSaveBookItem(this.bookItems[i]);
                }
            }
        }
    };
    HomeComponent.prototype.onSubmitBookItem = function (form) {
        console.log(form);
        var final_data;
        // let newUserData: string[];
        var formData = new FormData();
        if (this.files != null) {
            var files = this.files;
            for (var i = 0; i < files.length; i++) {
                formData.append('cover', files[i]);
            }
        }
        formData.append('bookName', form.value.bookName);
        formData.append('author', form.value.author);
        formData.append('publisherId', form.value.publisherId);
        formData.append('publisherName', form.value.publisherName);
        formData.append('publisherDescription', form.value.publisherName);
        formData.append('publisherAdress', form.value.publisherAdress);
        formData.append('category', form.value.category);
        formData.append('price', form.value.price);
        formData.append('isbn', form.value.isbn);
        // formData.append('password', form.value.password);
        final_data = formData;
        // } else {
        //   // Если нет файла, то слать как обычный JSON
        //   final_data = form.value;
        // }
        this.dataAccessService.createNewBookItem(final_data).subscribe(function (response) {
            console.log(response);
        });
    };
    HomeComponent.prototype.sortBooks = function (form) {
        this.changeSortDirect = true;
        this.onSortGet(form.value.sortBy, this.currentPage);
    };
    HomeComponent.prototype.deleteFromFilter = function (key) {
        if (this.dataAccessService.activeFilters.get(key).length === 0) {
            this.activeFilters.delete(key);
        }
        else {
            this.dataAccessService.activeFilters.get(key).pop();
            if (this.dataAccessService.activeFilters.get(key).length === 0) {
                this.activeFilters.delete(key);
            }
        }
        if (this.activeFilters.size === 0) {
            this.currentPage = 1;
            this.sortBy = 'author';
            this.changeSortDirect = false;
            this.url = this.serverURL + 'bookItems?sortBy=' + this.sortBy
                + '&changeSortDirect=' + true + '&page=' + this.currentPage + '&itemsPerPage=' + this.itemsPerPage;
            this.activeRow = -1;
            this.activeBookId = 0;
            this.dataAccessService.getTotalBookItemsCount();
            this.dataAccessService.getBookItems(this.url);
        }
        console.log(this.activeFilters);
        this.dataAccessService.activeFiltersChanged.next(this.dataAccessService.activeFilters);
    };
    __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Input"])(),
        __metadata("design:type", String)
    ], HomeComponent.prototype, "sortBy", void 0);
    __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Input"])(),
        __metadata("design:type", Map)
    ], HomeComponent.prototype, "activeFilters", void 0);
    HomeComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-home',
            template: __webpack_require__(/*! ./home.component.html */ "./src/app/home/home.component.html"),
            styles: [__webpack_require__(/*! ./home.component.css */ "./src/app/home/home.component.css")]
        }),
        __metadata("design:paramtypes", [_data_access_services_data_access_service__WEBPACK_IMPORTED_MODULE_2__["DataAccessService"]])
    ], HomeComponent);
    return HomeComponent;
}());



/***/ }),

/***/ "./src/app/login-new-user/login-new-user.component.css":
/*!*************************************************************!*\
  !*** ./src/app/login-new-user/login-new-user.component.css ***!
  \*************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "input.ng-invalid.ng-touched {\r\n  border: 1px solid red;\r\n}\r\n"

/***/ }),

/***/ "./src/app/login-new-user/login-new-user.component.html":
/*!**************************************************************!*\
  !*** ./src/app/login-new-user/login-new-user.component.html ***!
  \**************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<!--<ng-template #addUserModal let-modal>-->\n<div class=\"modal-body\">\n  <form (ngSubmit)=\"onSubmitUser(f)\" #f=\"ngForm\">\n    <div class=\"form-row\" *ngIf=\"login\">\n      <div class=\"col\">\n        <input type=\"text\" class=\"form-control\" placeholder=\"Login\" ngModel name=\"login\"\n               required>\n      </div>\n      <div class=\"col\">\n        <input type=\"password\" class=\"form-control\" placeholder=\"password\"\n               ngModel name=\"password\" #password=\"ngModel\"\n               pattern=\"{{confirmPasswordProp}}\" required>\n      </div>\n    </div>\n    <div *ngIf=\"!login\">\n      <div class=\"form-row\">\n        <div class=\"col\">\n          <input type=\"text\" class=\"form-control\" placeholder=\"Login\" ngModel name=\"login\"\n                 required>\n        </div>\n        <div class=\"col\">\n          <input type=\"email\" class=\"form-control\" placeholder=\"Email\" ngModel name=\"email\"\n                 required email>\n        </div>\n        <div class=\"col\">\n          <input type=\"text\" class=\"form-control\" placeholder=\"Phone\" ngModel name=\"phone\"\n                 required>\n        </div>\n      </div>\n\n      <hr>\n      <div class=\"form-row\">\n        <div class=\"col\">\n          <input type=\"text\" class=\"form-control\" placeholder=\"default delivery address\" ngModel\n                 name=\"address\">\n        </div>\n        <div class=\"col\">\n          <input type=\"text\" class=\"form-control\" placeholder=\"name\" ngModel name=\"name\">\n        </div>\n        <div class=\"col\">\n          <input type=\"text\" class=\"form-control\" placeholder=\"lastname\" ngModel name=\"lastname\">\n        </div>\n      </div>\n      <hr>\n      <div class=\"form-row\">\n        <div class=\"col\">\n          <input type=\"password\" class=\"form-control\" placeholder=\"password\"\n                 ngModel name=\"password\" #password=\"ngModel\"\n                 pattern=\"{{confirmPasswordProp}}\" [required]=\"confirm.value!=''\">\n        </div>\n        <div class=\"col\">\n          <input type=\"password\" class=\"form-control\" placeholder=\"confirm password\"\n                 [(ngModel)]=\"confirmPasswordProp\" name=\"confirmPassword\" #confirm=\"ngModel\"\n                 [required]=\"password.value!=''\">\n        </div>\n      </div>\n      <hr>\n      <input type=\"file\" name=\"photo\" (change)=\"addPhoto($event)\"/>\n\n    </div>\n    <hr>\n    <button type=\"submit\" class=\"btn btn-primary btn-block\"\n            [disabled]=\"!f.valid || !password.valid\"\n            *ngIf=\"!login\">submit\n    </button>\n    <button type=\"submit\" class=\"btn btn-primary btn-block\"\n            *ngIf=\"login\">submit\n    </button>\n  </form>\n\n  <hr>\n  <button type=\"button\" class=\"btn btn-link btn-block\"\n          *ngIf=\"!login\">Login page\n  </button>\n  <button type=\"button\" class=\"btn btn-link btn-block\"\n          *ngIf=\"login\">Create account\n  </button>\n\n\n</div>\n\n<div class=\"modal-footer\">\n  <button type=\"button\" class=\"btn btn-outline-dark\" (click)=\"activeModal.close('Close click')\">Close</button>\n</div>\n<!--</ng-template>-->\n\n\n<ng-template #userCreated let-modal>\n  <div class=\"modal-body\">\n    {{createUserReply}}\n  </div>\n  <div class=\"modal-footer\">\n    <button type=\"button\" class=\"btn btn-outline-dark\" (click)=\"modal.close()\">Close</button>\n  </div>\n</ng-template>\n"

/***/ }),

/***/ "./src/app/login-new-user/login-new-user.component.ts":
/*!************************************************************!*\
  !*** ./src/app/login-new-user/login-new-user.component.ts ***!
  \************************************************************/
/*! exports provided: LoginNewUserComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "LoginNewUserComponent", function() { return LoginNewUserComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _data_access_services_data_access_service__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! ../data-access-services/data-access.service */ "./src/app/data-access-services/data-access.service.ts");
/* harmony import */ var _ng_bootstrap_ng_bootstrap__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @ng-bootstrap/ng-bootstrap */ "./node_modules/@ng-bootstrap/ng-bootstrap/fesm5/ng-bootstrap.js");
/* harmony import */ var _environments_environment__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ../../environments/environment */ "./src/environments/environment.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};




var LoginNewUserComponent = /** @class */ (function () {
    function LoginNewUserComponent(dataAccessService, modalService, activeModal) {
        this.dataAccessService = dataAccessService;
        this.modalService = modalService;
        this.activeModal = activeModal;
        this.serverURL = _environments_environment__WEBPACK_IMPORTED_MODULE_3__["environment"].serverURL;
        this.createUserReply = '';
        this.confirmPasswordProp = '';
        this.login = true;
    }
    LoginNewUserComponent.prototype.ngOnInit = function () {
        // this.login = true;
    };
    LoginNewUserComponent.prototype.ngOnChanges = function (changes) {
        console.log(changes);
    };
    LoginNewUserComponent.prototype.onSubmitUser = function (form) {
        console.log(form);
        // let final_data;
        // // let newUserData: string[];
        // const formData = new FormData();
        // if (this.files != null) {
        //   const files: FileList = this.files;
        //   for (let i = 0; i < files.length; i++) {
        //     formData.append('photo', files[i]);
        //   }
        // }
        // formData.append('login', form.value.login);
        // formData.append('email', form.value.email);
        // formData.append('phone', form.value.phone);
        // formData.append('address', form.value.address);
        // formData.append('name', form.value.name);
        // formData.append('lastname', form.value.lastname);
        // formData.append('password', form.value.password);
        //
        // final_data = formData;
        // // } else {
        // //   // Если нет файла, то слать как обычный JSON
        // //   final_data = form.value;
        // // }
        //
        // this.dataAccessService.createNewUser(final_data).subscribe((response) => {
        //   console.log(response);
        //   if (response.status === 200) {
        //     const serverReply: string[] = response.json();
        //     this.serverReply = serverReply[0];
        //     this.openModal(this.userCreated);
        //   }
        // });
    };
    LoginNewUserComponent.prototype.openModal = function (addUserModal) {
        this.modalService.open(addUserModal, { size: 'lg' });
    };
    LoginNewUserComponent.prototype.addPhoto = function (event) {
        var target = event.target || event.srcElement;
        this.files = target.files;
    };
    __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["ViewChild"])('userCreated'),
        __metadata("design:type", Object)
    ], LoginNewUserComponent.prototype, "userCreated", void 0);
    __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Input"])(),
        __metadata("design:type", Object)
    ], LoginNewUserComponent.prototype, "login", void 0);
    LoginNewUserComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-login-new-user',
            template: __webpack_require__(/*! ./login-new-user.component.html */ "./src/app/login-new-user/login-new-user.component.html"),
            styles: [__webpack_require__(/*! ./login-new-user.component.css */ "./src/app/login-new-user/login-new-user.component.css")]
        }),
        __metadata("design:paramtypes", [_data_access_services_data_access_service__WEBPACK_IMPORTED_MODULE_1__["DataAccessService"],
            _ng_bootstrap_ng_bootstrap__WEBPACK_IMPORTED_MODULE_2__["NgbModal"],
            _ng_bootstrap_ng_bootstrap__WEBPACK_IMPORTED_MODULE_2__["NgbActiveModal"]])
    ], LoginNewUserComponent);
    return LoginNewUserComponent;
}());



/***/ }),

/***/ "./src/app/nav-bar/nav-bar.component.css":
/*!***********************************************!*\
  !*** ./src/app/nav-bar/nav-bar.component.css ***!
  \***********************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "\r\n/*.popover{*/\r\n  /*max-width: 800px !important;*/\r\n  /*}*/\r\n  .item-deleted{\r\n  text-decoration:line-through;\r\n  opacity: 0.5;\r\n}\r\n  input.ng-invalid.ng-touched {\r\n  border: 1px solid red;\r\n}\r\n  ::ng-deep.popover{\r\n  max-width:600px;\r\n  padding: 2px;\r\n  /*background-color: dodgerblue;*/\r\n  /*background-color:rgba(0, 0, 255, 0.5);*/\r\n  /*background-color:#f8f9fa;*/\r\n  /*background-color:#6c757d;*/\r\n  background-color: rgba(52,58,64,0.9);\r\n  border-radius: 25px;\r\n}\r\n"

/***/ }),

/***/ "./src/app/nav-bar/nav-bar.component.html":
/*!************************************************!*\
  !*** ./src/app/nav-bar/nav-bar.component.html ***!
  \************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<nav class=\"navbar navbar-expand-md navbar-dark bg-dark\">\r\n  <a class=\"navbar-brand text-primary\" routerLink=\"/\" style=\"line-height: 20%\">\r\n    <img src=\"{{serverURL}}static/book-logo-2.png\" width=\"50px\" height=\"50px\" align=\"left\">\r\n    <h3>OnlineBookStore</h3><span\r\n    class=\"text-primary text-muted float-right\" style=\"font-size: 80%\">books for everyone</span></a>\r\n  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\"\r\n          aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n    <span class=\"navbar-toggler-icon\"></span>\r\n  </button>\r\n\r\n  <button class=\"btn btn-primary\" (click)=\"sideBarTogle.emit()\" style=\"margin-left: 50px\">Sidebar toggle</button>\r\n  <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n    <ul class=\"navbar-nav ml-auto\" style=\"font-size: 1.2rem\">\r\n      <li class=\"nav-item\">\r\n\r\n        <a class=\"nav-link\" routerLink=\"/\">\r\n          <i class=\"fa fa-home\" aria-hidden=\"true\"></i>\r\n          Home</a>\r\n      </li>\r\n      <li class=\"nav-item\" [ngbPopover]=\"popContent\"\r\n          placement=\"bottom\"\r\n          triggers=\"mouseenter\"\r\n          [autoClose]=\"'outside'\">\r\n        <a class=\"nav-link\" routerLink=\"/cart\"\r\n           aria-disabled=\"true\"\r\n           [ngClass]=\"{disabled: shoppingCart.length===0}\">\r\n          <i class=\"fa fa-shopping-cart\" aria-hidden=\"true\"></i> Shopping cart\r\n        </a>\r\n      </li>\r\n\r\n      <li class=\"nav-item\" ngbDropdown>\r\n        <a class=\"nav-link\" id=\"dropdownBasic1\" ngbDropdownToggle>\r\n            <i class=\"fa fa-users\" aria-hidden=\"true\"></i>\r\n          <span *ngIf=\"loggedUser==null\"> User info</span>\r\n          <span *ngIf=\"loggedUser!=null\"> {{loggedUser.login}}</span>\r\n        </a>\r\n\r\n        <div ngbDropdownMenu aria-labelledby=\"dropdownBasic1\">\r\n          <button class=\"dropdown-item\"\r\n                  (click)=\"login=true;openAddUserModal(addUserModal)\">\r\n            <i class=\"fa fa-sign-in\" aria-hidden=\"true\"></i>\r\n            Login\r\n          </button>\r\n          <button class=\"dropdown-item\"\r\n                  (click)=\"login=false;openAddUserModal(addUserModal)\">\r\n            <i class=\"fa fa-plus\" aria-hidden=\"true\"></i>\r\n            Create account\r\n          </button>\r\n          <button class=\"dropdown-item\" (click)=\"goToCabinet()\"\r\n                  [disabled]=\"loggedUser==null\">\r\n            <i class=\"fa fa-user-circle-o\" aria-hidden=\"true\"></i>\r\n             User cabinet\r\n          </button>\r\n          <a class=\"dropdown-item\" href=\"{{this.serverURL}}adminPage\">\r\n            <i class=\"fa fa-user-circle-o\" aria-hidden=\"true\"></i>\r\n            Admin page</a>\r\n\r\n          <!--<button class=\"dropdown-item\" (click)=\"goToAdminPage()\"-->\r\n                  <!--[disabled]=\"loggedUser==null || loggedUser.role!=='ADMIN'\">-->\r\n            <!---->\r\n          <!--</button>-->\r\n          <div class=\"dropdown-divider\"></div>\r\n          <button class=\"dropdown-item\"\r\n                  (click)=\"logout()\">\r\n            <i class=\"fa fa-sign-out\" aria-hidden=\"true\"></i>\r\n            Logout\r\n          </button>\r\n        </div>\r\n\r\n      </li>\r\n    </ul>\r\n\r\n    <!--<form class=\"form-inline my-2 my-lg-0\">-->\r\n    <!--<input class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">-->\r\n    <!--<button class=\"btn btn-outline-success my-2 my-sm-0\" type=\"submit\">Search</button>-->\r\n    <!--</form>-->\r\n  </div>\r\n</nav>\r\n\r\n<ng-template #popContent>\r\n  <div class=\"container-fluid\" style=\"width: 425px\">\r\n    <div class=\"row\">\r\n      <div class=\"col-md-12\">\r\n        <app-book-item-midle-card\r\n          *ngFor=\"let itemEntry of shoppingCart\"\r\n          [activeBookItemDetails]=\"itemEntry.key\"\r\n          [shoppingCartNum]=\"itemEntry.value\"></app-book-item-midle-card>\r\n      </div>\r\n      <div class=\"col-md-12\">\r\n        <div class=\"card\">\r\n          <div class=\"card-body\">\r\n            <strong class=\"float-right text-primary\">Total: {{shoppingCartSum}}</strong>\r\n\r\n            <div class=\"btn-group btn-group-sm\">\r\n              <button type=\"button\"\r\n                      class=\"btn btn-outline-primary btn-sm\"\r\n                      (click)=\"goToCart()\"\r\n                      [disabled]=\"!shoppingCartSum\">\r\n                <i class=\"fa fa-shopping-cart\" aria-hidden=\"true\"></i> View cart\r\n              </button>\r\n            </div>\r\n\r\n          </div>\r\n        </div>\r\n      </div>\r\n    </div>\r\n  </div>\r\n</ng-template>\r\n\r\n<ng-template #addUserModal let-modal>\r\n  <div class=\"modal-body\">\r\n    <form (ngSubmit)=\"onSubmitUser(f)\" #f=\"ngForm\" *ngIf=\"!login\">\r\n\r\n      <div class=\"form-row\">\r\n        <div class=\"col\">\r\n          <input type=\"text\" class=\"form-control\" placeholder=\"Login\" ngModel name=\"login\"\r\n                 required>\r\n        </div>\r\n        <div class=\"col\">\r\n          <input type=\"email\" class=\"form-control\" placeholder=\"Email\" ngModel name=\"email\"\r\n                 required email>\r\n        </div>\r\n        <div class=\"col\">\r\n          <input type=\"text\" class=\"form-control\" placeholder=\"Phone\" ngModel name=\"phone\"\r\n                 required>\r\n        </div>\r\n      </div>\r\n\r\n      <hr>\r\n      <div class=\"form-row\">\r\n        <div class=\"col\">\r\n          <input type=\"text\" class=\"form-control\" placeholder=\"default delivery address\" ngModel\r\n                 name=\"address\">\r\n        </div>\r\n        <div class=\"col\">\r\n          <input type=\"text\" class=\"form-control\" placeholder=\"name\" ngModel name=\"name\">\r\n        </div>\r\n        <div class=\"col\">\r\n          <input type=\"text\" class=\"form-control\" placeholder=\"lastname\" ngModel name=\"lastname\">\r\n        </div>\r\n      </div>\r\n      <hr>\r\n      <div class=\"form-row\">\r\n        <div class=\"col\">\r\n          <input type=\"password\" class=\"form-control\" placeholder=\"password\"\r\n                 ngModel name=\"password\" #password=\"ngModel\"\r\n                 pattern=\"{{confirmPasswordProp}}\" [required]=\"confirm.value!=''\">\r\n        </div>\r\n        <div class=\"col\">\r\n          <input type=\"password\" class=\"form-control\" placeholder=\"confirm password\"\r\n                 [(ngModel)]=\"confirmPasswordProp\" name=\"confirmPassword\" #confirm=\"ngModel\"\r\n                 [required]=\"password.value!=''\">\r\n        </div>\r\n      </div>\r\n      <hr>\r\n      <input type=\"file\" name=\"photo\" (change)=\"addPhoto($event)\"/>\r\n\r\n      <hr>\r\n      <button type=\"submit\" class=\"btn btn-primary btn-block\"\r\n              [disabled]=\"!f.valid || !password.valid\"\r\n              *ngIf=\"!login\">submit\r\n      </button>\r\n\r\n    </form>\r\n\r\n    <form (ngSubmit)=\"onLogin(f2)\" #f2=\"ngForm\" *ngIf=\"login\">\r\n      <div class=\"form-row\">\r\n        <div class=\"col\">\r\n          <input type=\"text\" class=\"form-control\" placeholder=\"Login\" ngModel name=\"login\"\r\n                 required>\r\n        </div>\r\n        <div class=\"col\">\r\n          <input type=\"password\" class=\"form-control\" placeholder=\"password\"\r\n                 ngModel name=\"password\" #password1=\"ngModel\"\r\n                 pattern=\"{{confirmPasswordProp}}\" required>\r\n        </div>\r\n        <small id=\"emailHelp\" class=\"form-text text-muted\" >{{serverReply}}\r\n        </small>\r\n      </div>\r\n      <hr>\r\n      <button type=\"submit\" class=\"btn btn-primary btn-block\"\r\n              [disabled]=\"!f2.valid\">submit\r\n      </button>\r\n    </form>\r\n\r\n    <hr>\r\n    <button type=\"button\" class=\"btn btn-link btn-block\"\r\n            *ngIf=\"!login\" (click)=\"login=true\">Login page\r\n    </button>\r\n    <button type=\"button\" class=\"btn btn-link btn-block\"\r\n            *ngIf=\"login\" (click)=\"login=false\">Create account\r\n    </button>\r\n\r\n  </div>\r\n\r\n  <div class=\"modal-footer\">\r\n    <button type=\"button\" class=\"btn btn-outline-dark\" (click)=\"modal.close()\">Close</button>\r\n  </div>\r\n</ng-template>\r\n\r\n<ng-template #userCreated let-modal>\r\n  <div class=\"modal-body\">\r\n    {{serverReply}}\r\n  </div>\r\n  <div class=\"modal-footer\">\r\n    <button type=\"button\" class=\"btn btn-outline-dark\" (click)=\"modal.close()\">Close</button>\r\n  </div>\r\n</ng-template>\r\n\r\n"

/***/ }),

/***/ "./src/app/nav-bar/nav-bar.component.ts":
/*!**********************************************!*\
  !*** ./src/app/nav-bar/nav-bar.component.ts ***!
  \**********************************************/
/*! exports provided: NavBarComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "NavBarComponent", function() { return NavBarComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _data_access_services_data_access_service__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! ../data-access-services/data-access.service */ "./src/app/data-access-services/data-access.service.ts");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm5/router.js");
/* harmony import */ var _ng_bootstrap_ng_bootstrap__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! @ng-bootstrap/ng-bootstrap */ "./node_modules/@ng-bootstrap/ng-bootstrap/fesm5/ng-bootstrap.js");
/* harmony import */ var _environments_environment__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! ../../environments/environment */ "./src/environments/environment.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};





var NavBarComponent = /** @class */ (function () {
    function NavBarComponent(dataAccessService, router, modalService) {
        this.dataAccessService = dataAccessService;
        this.router = router;
        this.modalService = modalService;
        this.serverURL = _environments_environment__WEBPACK_IMPORTED_MODULE_4__["environment"].serverURL;
        this.sideBarTogle = new _angular_core__WEBPACK_IMPORTED_MODULE_0__["EventEmitter"]();
        this.serverReply = '';
        this.submitOrderReply = '';
        this.confirmPasswordProp = '';
        this.login = true;
    }
    NavBarComponent.prototype.ngOnInit = function () {
        var _this = this;
        this.loggedUser = this.dataAccessService.loggedUser;
        this.loggedUserOrders = this.dataAccessService.loggedUserOrders;
        this.shoppingCart = this.dataAccessService.shoppingCart;
        this.subscriptionShoppingCartSum = this.dataAccessService.totalShoppingCartSumChanged
            .subscribe(function (sum) {
            _this.shoppingCartSum = sum;
        });
        this.subscriptionLoggedUserChanged = this.dataAccessService.loggedUserChanged
            .subscribe(function (user) {
            _this.loggedUser = user;
        });
        this.subscriptionLoggedUserOrdersChanged = this.dataAccessService.loggedUserOrdersChanged
            .subscribe(function (orders) {
            _this.loggedUserOrders = orders;
        });
    };
    NavBarComponent.prototype.goToCart = function () {
        this.router.navigate(['cart']);
    };
    NavBarComponent.prototype.goToCabinet = function () {
        this.router.navigate(['userCabinet']);
    };
    NavBarComponent.prototype.onSubmitUser = function (form) {
        var _this = this;
        console.log(form);
        var final_data;
        // let newUserData: string[];
        var formData = new FormData();
        if (this.files != null) {
            var files = this.files;
            for (var i = 0; i < files.length; i++) {
                formData.append('photo', files[i]);
            }
        }
        formData.append('login', form.value.login);
        formData.append('email', form.value.email);
        formData.append('phone', form.value.phone);
        formData.append('address', form.value.address);
        formData.append('name', form.value.name);
        formData.append('lastname', form.value.lastname);
        formData.append('password', form.value.password);
        final_data = formData;
        // } else {
        //   // Если нет файла, то слать как обычный JSON
        //   final_data = form.value;
        // }
        this.dataAccessService.createNewUser(final_data).subscribe(function (response) {
            console.log(response);
            if (response.status === 200) {
                var serverReply = response.json();
                _this.serverReply = serverReply[0];
                _this.openModal(_this.userCreated);
            }
        });
    };
    NavBarComponent.prototype.onLogin = function (form) {
        var final_data;
        final_data = { login: form.value.login, password: form.value.password };
        this.dataAccessService.login(final_data);
        this.modalService.dismissAll();
    };
    NavBarComponent.prototype.openModal = function (addUserModal) {
        this.modalService.open(addUserModal, { size: 'lg' });
    };
    NavBarComponent.prototype.addPhoto = function (event) {
        var target = event.target || event.srcElement;
        this.files = target.files;
    };
    NavBarComponent.prototype.openAddUserModal = function (addUserModal) {
        if (this.login) {
            this.modalService.open(addUserModal);
        }
        else {
            this.modalService.open(addUserModal, { size: 'lg' });
        }
    };
    NavBarComponent.prototype.goToAdminPage = function () {
        // this.dataAccessService.goToAdminPage();
        this.router.navigate([this.serverURL + 'adminPage']);
    };
    NavBarComponent.prototype.logout = function () {
        this.dataAccessService.logout();
        this.router.navigate(['/']);
    };
    __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Output"])(),
        __metadata("design:type", Object)
    ], NavBarComponent.prototype, "sideBarTogle", void 0);
    __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["ViewChild"])('userCreated'),
        __metadata("design:type", Object)
    ], NavBarComponent.prototype, "userCreated", void 0);
    NavBarComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-nav-bar',
            template: __webpack_require__(/*! ./nav-bar.component.html */ "./src/app/nav-bar/nav-bar.component.html"),
            styles: [__webpack_require__(/*! ./nav-bar.component.css */ "./src/app/nav-bar/nav-bar.component.css")]
        }),
        __metadata("design:paramtypes", [_data_access_services_data_access_service__WEBPACK_IMPORTED_MODULE_1__["DataAccessService"],
            _angular_router__WEBPACK_IMPORTED_MODULE_2__["Router"],
            _ng_bootstrap_ng_bootstrap__WEBPACK_IMPORTED_MODULE_3__["NgbModal"]])
    ], NavBarComponent);
    return NavBarComponent;
}());



/***/ }),

/***/ "./src/app/page-footer/page-footer.component.css":
/*!*******************************************************!*\
  !*** ./src/app/page-footer/page-footer.component.css ***!
  \*******************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = ".footer{\r\n  position: relative;\r\n  display: flex;\r\n  flex-wrap: wrap;\r\n  align-items: center;\r\n  -ms-flex-pack: justify;\r\n  /*justify-content: space-between;*/\r\n  /*justify-content: center;*/\r\n  padding: 0.5rem 1rem;\r\n  background-color: #343a40;\r\n  /*bottom: 0;*/\r\n}\r\n"

/***/ }),

/***/ "./src/app/page-footer/page-footer.component.html":
/*!********************************************************!*\
  !*** ./src/app/page-footer/page-footer.component.html ***!
  \********************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<!--<div class=\"footer\">-->\r\n  <!--<div class=\"container-fluid\">-->\r\n  <div class=\"row\">\r\n    <div class=\"col-md-12 \">\r\n      <img src=\"{{serverURL}}static/book-logo-2.png\" width=\"50px\" height=\"50px\" align=\"left\">\r\n      <a class=\"text-primary\" routerLink=\"/\" style=\"line-height: 20%\">\r\n        <span style=\"font-size: 1.5rem\">OnlineBookStore</span>\r\n        <br>\r\n        <span class=\"text-white text-muted\" style=\"font-size: 80%\">books for everyone</span>\r\n      </a>\r\n      <br>\r\n      <br>\r\n      <div class=\"text-center\">\r\n        <a class=\"btn btn-social-icon btn-facebook\"><i class=\"fa fa-facebook\"></i></a>\r\n        <a class=\"btn btn-social-icon btn-google-plus\"><i class=\"fa fa-google-plus\"></i></a>\r\n        <a class=\"btn btn-social-icon btn-instagram\"><i class=\"fa fa-instagram\"></i></a>\r\n        <a class=\"btn btn-social-icon btn-twitter\"><i class=\"fa fa-twitter\"></i></a>\r\n        <a class=\"btn btn-social-icon btn-vk\"><i class=\"fa fa-vk\"></i></a>\r\n      </div>\r\n    </div>\r\n  </div>\r\n\r\n  <!--</div>-->\r\n<!--</div>-->\r\n\r\n"

/***/ }),

/***/ "./src/app/page-footer/page-footer.component.ts":
/*!******************************************************!*\
  !*** ./src/app/page-footer/page-footer.component.ts ***!
  \******************************************************/
/*! exports provided: PageFooterComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "PageFooterComponent", function() { return PageFooterComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _environments_environment__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! ../../environments/environment */ "./src/environments/environment.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var PageFooterComponent = /** @class */ (function () {
    function PageFooterComponent() {
        this.serverURL = _environments_environment__WEBPACK_IMPORTED_MODULE_1__["environment"].serverURL;
    }
    PageFooterComponent.prototype.ngOnInit = function () {
    };
    PageFooterComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-page-footer',
            template: __webpack_require__(/*! ./page-footer.component.html */ "./src/app/page-footer/page-footer.component.html"),
            styles: [__webpack_require__(/*! ./page-footer.component.css */ "./src/app/page-footer/page-footer.component.css")]
        }),
        __metadata("design:paramtypes", [])
    ], PageFooterComponent);
    return PageFooterComponent;
}());



/***/ }),

/***/ "./src/app/shopping-cart/shopping-cart.component.css":
/*!***********************************************************!*\
  !*** ./src/app/shopping-cart/shopping-cart.component.css ***!
  \***********************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = ".item-deleted{\r\n  text-decoration:line-through;\r\n  opacity: 0.5;\r\n}\r\n\r\ninput.ng-invalid.ng-touched {\r\n  border: 1px solid red;\r\n}\r\n"

/***/ }),

/***/ "./src/app/shopping-cart/shopping-cart.component.html":
/*!************************************************************!*\
  !*** ./src/app/shopping-cart/shopping-cart.component.html ***!
  \************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<div class=\"container-fluid\">\r\n  <div class=\"row\">\r\n    <div class=\"col-md-6\">\r\n      <div class=\"card\">\r\n        <div class=\"card-header\">\r\n          submit order\r\n          <div class=\"btn-group btn-group-sm float-right\">\r\n            <button type=\"button\" class=\"btn btn-outline-success btn-sm\"\r\n                    (click)=\"login=true;openAddUserModal(addUserModal)\">\r\n              <i class=\"fa fa-sign-in\" aria-hidden=\"true\"></i>\r\n              Login\r\n            </button>\r\n            <button type=\"button\" class=\"btn btn-outline-primary btn-sm\"\r\n                    (click)=\"login=false;openAddUserModal(addUserModal)\">\r\n              <i class=\"fa fa-plus\" aria-hidden=\"true\"></i> New account\r\n            </button>\r\n          </div>\r\n        </div>\r\n        <div class=\"card-body\">\r\n          <form (ngSubmit)=\"onSubmitOrder(f3)\" #f3=\"ngForm\" >\r\n            <div class=\"form-row\" *ngIf=\"loggedUser==null\">\r\n              <div class=\"col\">\r\n                <label for=\"email\">Enter your email</label>\r\n                <input type=\"email\" class=\"form-control\" ngModel name=\"email\"\r\n                       [required]=\"loggedUser==null\" email id=\"email\" [readonly]=\"loggedUser!=null\"\r\n                       value=\"{{this.loggedUser!=null ? loggedUser.email : ''}}\">\r\n              </div>\r\n              <div class=\"col\">\r\n                <label for=\"phone\">Enter your phone</label>\r\n                <input type=\"text\" class=\"form-control\" ngModel name=\"phone\"\r\n                       [required]=\"loggedUser==null\" id=\"phone\" [readonly]=\"loggedUser!=null\"\r\n                       value=\"{{loggedUser!=null?loggedUser.phone:''}}\">\r\n              </div>\r\n            </div>\r\n            <div *ngIf=\"loggedUser!=null\">\r\n              <h5>You logged in as {{loggedUser.login}}</h5>\r\n              <hr>\r\n              <ul class=\"list-unstyled\">\r\n                <li>Email: {{loggedUser.email}}</li>\r\n                <li>Phone: {{loggedUser.phone}}</li>\r\n              </ul>\r\n              <hr>\r\n            </div>\r\n            <small class=\"form-text text-muted\">Our manager will contact with you as soon as possible</small>\r\n            <hr>\r\n            <div>\r\n              <ng-template #popContent let-id=\"id\">\r\n                <img class=\"img-fluid\" src=\"{{serverURL}}cover/{{id}}\"/></ng-template>\r\n              <table class=\"table table-bordered  table-striped table-hover\" style=\"margin-bottom: 0px\">\r\n                <thead class=\"thead-light\">\r\n                <tr>\r\n                  <th class=\"text-primary\">#</th>\r\n                  <th class=\"text-primary\">Book cover</th>\r\n                  <th class=\"text-primary\">Book id</th>\r\n                  <th class=\"text-primary\">Book name</th>\r\n                  <th class=\"text-primary\">Book price</th>\r\n                  <th class=\"text-primary\">Book quantity</th>\r\n                </tr>\r\n                </thead>\r\n                <tbody>\r\n                <tr *ngFor=\"let entry of shoppingCart, let i=index\" (click)=\"setActiveRow(i, entry.key.id)\"\r\n                    [ngClass]=\"{'bg-info': i == activeRowIndex}\">\r\n                  <td [ngClass]=\"{'item-deleted': entry.value==0}\">{{i+1}}</td>\r\n                  <td [ngClass]=\"{'item-deleted': entry.value==0}\">\r\n                    <img src=\"{{serverURL}}/cover/{{entry.key.id}}\"\r\n                         width=\"50px\" height=\"80px\"\r\n                         [ngbPopover]=\"popContent\"\r\n                         #pop=\"ngbPopover\"\r\n                         (click)=\"togglePopover(pop,entry.key.id)\"\r\n                         triggers=\"manual\"\r\n                         style=\"cursor: pointer\"/>\r\n                  </td>\r\n                  <td [ngClass]=\"{'item-deleted': entry.value==0}\">{{entry.key.id}}</td>\r\n                  <td [ngClass]=\"{'item-deleted': entry.value==0}\">{{entry.key.bookName}}</td>\r\n                  <td [ngClass]=\"{'item-deleted': entry.value==0}\">{{entry.key.price}}</td>\r\n\r\n                  <td>{{entry.value}}\r\n                    <div class=\"btn-group btn-group-sm\">\r\n                      <button type=\"button\" class=\"btn btn-outline-primary btn-sm\"\r\n                              (click)=\"onAddToCart(entry.key)\">\r\n                        <i class=\"fa fa-plus-square\" aria-hidden=\"true\"></i>\r\n                      </button>\r\n                      <button type=\"button\" class=\"btn btn-outline-danger btn-sm\"\r\n                              (click)=\"deleteFromCart(entry.key)\">\r\n                        <i class=\"fa fa-minus-square\" aria-hidden=\"true\"></i>\r\n                      </button>\r\n                    </div>\r\n                  </td>\r\n                </tr>\r\n                </tbody>\r\n                <tfoot>\r\n                <tr>\r\n                  <td colspan=\"4\"><h5 style=\"text-align: right\">Total price:</h5></td>\r\n                  <td><h5>{{shoppingCartSum}}</h5></td>\r\n                  <td>\r\n                    <button type=\"submit\" class=\"btn btn-outline-primary btn-sm\"\r\n                            [disabled]=\"!f3.valid\"><i class=\"fa fa-credit-card\" aria-hidden=\"true\"></i>\r\n                      submit order\r\n                    </button>\r\n                  </td>\r\n                </tr>\r\n                </tfoot>\r\n              </table>\r\n            </div>\r\n          </form>\r\n\r\n        </div>\r\n      </div>\r\n    </div>\r\n    <div class=\"col-md-6\">\r\n      <app-book-item-details [activeBookItemDetails]=\"activeBookItem\"\r\n                             [showSameCat]=\"false\"></app-book-item-details>\r\n    </div>\r\n  </div>\r\n</div>\r\n\r\n<ng-template #addUserModal let-modal>\r\n  <div class=\"modal-body\">\r\n    <form (ngSubmit)=\"onSubmitUser(f)\" #f=\"ngForm\" *ngIf=\"!login\">\r\n\r\n      <div class=\"form-row\">\r\n        <div class=\"col\">\r\n          <input type=\"text\" class=\"form-control\" placeholder=\"Login\" ngModel name=\"login\"\r\n                 required>\r\n        </div>\r\n        <div class=\"col\">\r\n          <input type=\"email\" class=\"form-control\" placeholder=\"Email\" ngModel name=\"email\"\r\n                 required email>\r\n        </div>\r\n        <div class=\"col\">\r\n          <input type=\"text\" class=\"form-control\" placeholder=\"Phone\" ngModel name=\"phone\"\r\n                 required>\r\n        </div>\r\n      </div>\r\n\r\n      <hr>\r\n      <div class=\"form-row\">\r\n        <div class=\"col\">\r\n          <input type=\"text\" class=\"form-control\" placeholder=\"default delivery address\" ngModel\r\n                 name=\"address\">\r\n        </div>\r\n        <div class=\"col\">\r\n          <input type=\"text\" class=\"form-control\" placeholder=\"name\" ngModel name=\"name\">\r\n        </div>\r\n        <div class=\"col\">\r\n          <input type=\"text\" class=\"form-control\" placeholder=\"lastname\" ngModel name=\"lastname\">\r\n        </div>\r\n      </div>\r\n      <hr>\r\n      <div class=\"form-row\">\r\n        <div class=\"col\">\r\n          <input type=\"password\" class=\"form-control\" placeholder=\"password\"\r\n                 ngModel name=\"password\" #password=\"ngModel\"\r\n                 pattern=\"{{confirmPasswordProp}}\" [required]=\"confirm.value!=''\">\r\n        </div>\r\n        <div class=\"col\">\r\n          <input type=\"password\" class=\"form-control\" placeholder=\"confirm password\"\r\n                 [(ngModel)]=\"confirmPasswordProp\" name=\"confirmPassword\" #confirm=\"ngModel\"\r\n                 [required]=\"password.value!=''\">\r\n        </div>\r\n      </div>\r\n      <hr>\r\n      <input type=\"file\" name=\"photo\" (change)=\"addPhoto($event)\"/>\r\n\r\n      <hr>\r\n      <button type=\"submit\" class=\"btn btn-primary btn-block\"\r\n              [disabled]=\"!f.valid || !password.valid\"\r\n              *ngIf=\"!login\">submit\r\n      </button>\r\n\r\n    </form>\r\n\r\n    <form (ngSubmit)=\"onLogin(f2)\" #f2=\"ngForm\" *ngIf=\"login\">\r\n      <div class=\"form-row\">\r\n        <div class=\"col\">\r\n          <input type=\"text\" class=\"form-control\" placeholder=\"Login\" ngModel name=\"login\"\r\n                 required>\r\n        </div>\r\n        <div class=\"col\">\r\n          <input type=\"password\" class=\"form-control\" placeholder=\"password\"\r\n                 ngModel name=\"password\" #password1=\"ngModel\"\r\n                 pattern=\"{{confirmPasswordProp}}\" required>\r\n        </div>\r\n      </div>\r\n      <hr>\r\n      <button type=\"submit\" class=\"btn btn-primary btn-block\"\r\n              [disabled]=\"!f2.valid\">submit\r\n      </button>\r\n    </form>\r\n\r\n    <hr>\r\n    <button type=\"button\" class=\"btn btn-link btn-block\"\r\n            *ngIf=\"!login\" (click)=\"login=true\">Login page\r\n    </button>\r\n    <button type=\"button\" class=\"btn btn-link btn-block\"\r\n            *ngIf=\"login\" (click)=\"login=false\">Create account\r\n    </button>\r\n\r\n  </div>\r\n\r\n  <div class=\"modal-footer\">\r\n    <button type=\"button\" class=\"btn btn-outline-dark\" (click)=\"modal.close()\">Close</button>\r\n  </div>\r\n</ng-template>\r\n\r\n<ng-template #userCreated let-modal>\r\n  <div class=\"modal-body\">\r\n    {{serverReply}}\r\n  </div>\r\n  <div class=\"modal-footer\">\r\n    <button type=\"button\" class=\"btn btn-outline-dark\" (click)=\"modal.close()\">Close</button>\r\n  </div>\r\n</ng-template>\r\n"

/***/ }),

/***/ "./src/app/shopping-cart/shopping-cart.component.ts":
/*!**********************************************************!*\
  !*** ./src/app/shopping-cart/shopping-cart.component.ts ***!
  \**********************************************************/
/*! exports provided: ShoppingCartComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "ShoppingCartComponent", function() { return ShoppingCartComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _ng_bootstrap_ng_bootstrap__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @ng-bootstrap/ng-bootstrap */ "./node_modules/@ng-bootstrap/ng-bootstrap/fesm5/ng-bootstrap.js");
/* harmony import */ var _data_access_services_data_access_service__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ../data-access-services/data-access.service */ "./src/app/data-access-services/data-access.service.ts");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm5/router.js");
/* harmony import */ var _data_models_User__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! ../data-models/User */ "./src/app/data-models/User.ts");
/* harmony import */ var _data_models_Shipment2__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! ../data-models/Shipment2 */ "./src/app/data-models/Shipment2.ts");
/* harmony import */ var _data_models_Order__WEBPACK_IMPORTED_MODULE_6__ = __webpack_require__(/*! ../data-models/Order */ "./src/app/data-models/Order.ts");
/* harmony import */ var _environments_environment__WEBPACK_IMPORTED_MODULE_7__ = __webpack_require__(/*! ../../environments/environment */ "./src/environments/environment.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};








var ShoppingCartComponent = /** @class */ (function () {
    function ShoppingCartComponent(dataAccessService, router, modalService) {
        this.dataAccessService = dataAccessService;
        this.router = router;
        this.modalService = modalService;
        this.serverURL = _environments_environment__WEBPACK_IMPORTED_MODULE_7__["environment"].serverURL;
        this.serverReply = '';
        this.submitOrderReply = '';
        this.confirmPasswordProp = '';
        this.login = true;
    }
    ShoppingCartComponent.prototype.ngOnInit = function () {
        var _this = this;
        this.loggedUser = this.dataAccessService.loggedUser;
        this.loggedUserOrders = this.dataAccessService.loggedUserOrders;
        this.activeRowIndex = 0;
        this.shoppingCart = this.dataAccessService.shoppingCart;
        this.activeBookItem = this.shoppingCart[0].key;
        this.activeBookItemId = this.activeBookItem.id;
        this.subscriptionShoppingCartSum = this.dataAccessService.totalShoppingCartSumChanged
            .subscribe(function (sum) {
            _this.shoppingCartSum = sum;
        });
        this.subscriptionLoggedUserChanged = this.dataAccessService.loggedUserChanged
            .subscribe(function (user) {
            _this.loggedUser = user;
        });
        this.subscriptionLoggedUserOrdersChanged = this.dataAccessService.loggedUserOrdersChanged
            .subscribe(function (orders) {
            _this.loggedUserOrders = orders;
        });
        this.shoppingCartSum = this.dataAccessService.totalShoppingCartSum;
    };
    ShoppingCartComponent.prototype.togglePopover = function (popover, id) {
        if (id == null) {
            popover.close();
        }
        else if (popover.isOpen()) {
            popover.close();
        }
        else {
            popover.open({ id: id });
        }
    };
    ShoppingCartComponent.prototype.onAddToCart = function (bookItem) {
        this.dataAccessService.addToCart(bookItem, 1);
    };
    ShoppingCartComponent.prototype.deleteFromCart = function (bookItem) {
        this.dataAccessService.deleteFromCart(bookItem);
    };
    ShoppingCartComponent.prototype.setActiveRow = function (index1, orderId) {
        this.activeRowIndex = index1;
        this.activeBookItemId = orderId;
        for (var _i = 0, _a = this.shoppingCart; _i < _a.length; _i++) {
            var entry = _a[_i];
            if (entry.key.id === orderId) {
                this.activeBookItem = entry.key;
            }
        }
    };
    ShoppingCartComponent.prototype.openAddUserModal = function (addUserModal) {
        if (this.login) {
            this.modalService.open(addUserModal);
        }
        else {
            this.modalService.open(addUserModal, { size: 'lg' });
        }
    };
    ShoppingCartComponent.prototype.onSubmitOrder = function (form) {
        var _this = this;
        console.log(form);
        var final_data;
        var formData = new FormData();
        formData.append('email', form.value.email);
        formData.append('phone', form.value.phone);
        final_data = formData;
        var user = new _data_models_User__WEBPACK_IMPORTED_MODULE_4__["User"](0, null, form.value.email, form.value.phone, null, null, null, 'CUSTOMER', null, null);
        if (this.loggedUser != null) {
            user = this.loggedUser;
        }
        var order = new _data_models_Order__WEBPACK_IMPORTED_MODULE_6__["Order"](this.shoppingCart, Math.floor(this.shoppingCartSum * 100) / 100, user, new _data_models_Shipment2__WEBPACK_IMPORTED_MODULE_5__["Shipment2"](0, 'default', 'unProcessed', 0), 'unProcessed', new Date());
        this.dataAccessService.submitOrder(order).subscribe(function (response) {
            console.log(response);
            if (response.status === 200) {
                var serverReply = response.json();
                _this.serverReply = serverReply[0];
                _this.openModal(_this.userCreated);
            }
        });
        this.router.navigate(['']);
        this.dataAccessService.shoppingCart.splice(0, this.dataAccessService.shoppingCart.length);
    };
    ShoppingCartComponent.prototype.onSubmitUser = function (form) {
        var _this = this;
        console.log(form);
        var final_data;
        // let newUserData: string[];
        var formData = new FormData();
        if (this.files != null) {
            var files = this.files;
            for (var i = 0; i < files.length; i++) {
                formData.append('photo', files[i]);
            }
        }
        formData.append('login', form.value.login);
        formData.append('email', form.value.email);
        formData.append('phone', form.value.phone);
        formData.append('address', form.value.address);
        formData.append('name', form.value.name);
        formData.append('lastname', form.value.lastname);
        formData.append('password', form.value.password);
        final_data = formData;
        this.dataAccessService.createNewUser(final_data).subscribe(function (response) {
            console.log(response);
            if (response.status === 200) {
                var serverReply = response.json();
                _this.serverReply = serverReply[0];
                _this.openModal(_this.userCreated);
            }
        });
    };
    ShoppingCartComponent.prototype.onLogin = function (form) {
        var final_data;
        final_data = { login: form.value.login, password: form.value.password };
        this.dataAccessService.login(final_data);
        this.modalService.dismissAll();
    };
    ShoppingCartComponent.prototype.openModal = function (addUserModal) {
        this.modalService.open(addUserModal, { size: 'lg' });
    };
    ShoppingCartComponent.prototype.addPhoto = function (event) {
        var target = event.target || event.srcElement;
        this.files = target.files;
    };
    __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["ViewChild"])('userCreated'),
        __metadata("design:type", Object)
    ], ShoppingCartComponent.prototype, "userCreated", void 0);
    ShoppingCartComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-shopping-cart',
            template: __webpack_require__(/*! ./shopping-cart.component.html */ "./src/app/shopping-cart/shopping-cart.component.html"),
            styles: [__webpack_require__(/*! ./shopping-cart.component.css */ "./src/app/shopping-cart/shopping-cart.component.css")]
        }),
        __metadata("design:paramtypes", [_data_access_services_data_access_service__WEBPACK_IMPORTED_MODULE_2__["DataAccessService"],
            _angular_router__WEBPACK_IMPORTED_MODULE_3__["Router"],
            _ng_bootstrap_ng_bootstrap__WEBPACK_IMPORTED_MODULE_1__["NgbModal"]])
    ], ShoppingCartComponent);
    return ShoppingCartComponent;
}());



/***/ }),

/***/ "./src/app/side-menu/side-menu.component.css":
/*!***************************************************!*\
  !*** ./src/app/side-menu/side-menu.component.css ***!
  \***************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = ""

/***/ }),

/***/ "./src/app/side-menu/side-menu.component.html":
/*!****************************************************!*\
  !*** ./src/app/side-menu/side-menu.component.html ***!
  \****************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<div class=\"container-fluid\">\r\n  <div class=\"row\">\r\n    <div class=\"col\" style=\"padding-left: 5px; padding-right: 5px\">\r\n      <ul class=\"list-group list-group-flush\" style=\"white-space: nowrap;\r\n       overflow: hidden;\r\n       text-overflow: ellipsis\">\r\n        <li class=\"list-group-item\" >\r\n          <h5 (click)=\"categories=((categories=='showCat')?'hideCat':'showCat')\">Product categories</h5>\r\n          <ul class=\"list-group list-group-flush\" [@categories]=\"categories\">\r\n            <li class=\"list-group-item\" (click)=\"setActiveFilter(category,'category')\" *ngFor=\"let category of bookParams[0]\">{{category}}</li>\r\n          </ul>\r\n        </li>\r\n        <li class=\"list-group-item\">\r\n          <h5 (click)=\"authors=((authors=='showAut')?'hideAut':'showAut')\">Authors</h5>\r\n          <ul class=\"list-group list-group-flush\" [@authors]=\"authors\">\r\n            <li class=\"list-group-item\" (click)=\"setActiveFilter(author, 'author')\" *ngFor=\"let author of bookParams[1]\">{{author}}</li>\r\n          </ul>\r\n        </li>\r\n        <li class=\"list-group-item\" >\r\n          <h5 (click)=\"publishers=((publishers=='showPub')?'hidePub':'showPub')\">Publishers</h5>\r\n          <ul class=\"list-group list-group-flush\" [@publishers]=\"publishers\">\r\n            <li class=\"list-group-item\" (click)=\"setActiveFilter(publisher, 'publisher')\" *ngFor=\"let publisher of bookParams[2]\">{{publisher}}</li>\r\n          </ul>\r\n        </li>\r\n      </ul>\r\n    </div>\r\n  </div>\r\n</div>\r\n\r\n"

/***/ }),

/***/ "./src/app/side-menu/side-menu.component.ts":
/*!**************************************************!*\
  !*** ./src/app/side-menu/side-menu.component.ts ***!
  \**************************************************/
/*! exports provided: SideMenuComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "SideMenuComponent", function() { return SideMenuComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _data_access_services_data_access_service__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! ../data-access-services/data-access.service */ "./src/app/data-access-services/data-access.service.ts");
/* harmony import */ var _angular_animations__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/animations */ "./node_modules/@angular/animations/fesm5/animations.js");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};



var SideMenuComponent = /** @class */ (function () {
    function SideMenuComponent(dataAccessService) {
        this.dataAccessService = dataAccessService;
        this.bookParams = [];
    }
    SideMenuComponent.prototype.ngOnInit = function () {
        var _this = this;
        this.dataAccessService.getBookParameters().subscribe(function (response) {
            var data = response.json();
            _this.bookParams = data;
        });
        this.categories = 'hideCat';
        this.authors = 'hideAut';
        this.publishers = 'hidePub';
    };
    SideMenuComponent.prototype.setActiveFilter = function (filter, filterName) {
        if (this.dataAccessService.activeFilters.has(filterName)) {
            this.dataAccessService.activeFilters.get(filterName).push(filter);
        }
        else {
            this.dataAccessService.activeFilters.set(filterName, [filter]);
        }
        this.dataAccessService.activeFiltersChanged.next(this.dataAccessService.activeFilters);
    };
    SideMenuComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-side-menu',
            template: __webpack_require__(/*! ./side-menu.component.html */ "./src/app/side-menu/side-menu.component.html"),
            styles: [__webpack_require__(/*! ./side-menu.component.css */ "./src/app/side-menu/side-menu.component.css")],
            animations: [
                Object(_angular_animations__WEBPACK_IMPORTED_MODULE_2__["trigger"])('categories', [
                    Object(_angular_animations__WEBPACK_IMPORTED_MODULE_2__["state"])('hideCat', Object(_angular_animations__WEBPACK_IMPORTED_MODULE_2__["style"])({
                        height: '0px',
                        overflow: 'hidden',
                        'text-overflow': 'ellipsis'
                    })),
                    Object(_angular_animations__WEBPACK_IMPORTED_MODULE_2__["state"])('showCat', Object(_angular_animations__WEBPACK_IMPORTED_MODULE_2__["style"])({})),
                    Object(_angular_animations__WEBPACK_IMPORTED_MODULE_2__["transition"])('showCat <=> hideCat', Object(_angular_animations__WEBPACK_IMPORTED_MODULE_2__["animate"])(500)),
                ]),
                Object(_angular_animations__WEBPACK_IMPORTED_MODULE_2__["trigger"])('authors', [
                    Object(_angular_animations__WEBPACK_IMPORTED_MODULE_2__["state"])('hideAut', Object(_angular_animations__WEBPACK_IMPORTED_MODULE_2__["style"])({
                        height: '0px',
                        overflow: 'hidden',
                        'text-overflow': 'ellipsis'
                    })),
                    Object(_angular_animations__WEBPACK_IMPORTED_MODULE_2__["state"])('showAut', Object(_angular_animations__WEBPACK_IMPORTED_MODULE_2__["style"])({})),
                    Object(_angular_animations__WEBPACK_IMPORTED_MODULE_2__["transition"])('showAut <=> hideAut', Object(_angular_animations__WEBPACK_IMPORTED_MODULE_2__["animate"])(500)),
                ]),
                Object(_angular_animations__WEBPACK_IMPORTED_MODULE_2__["trigger"])('publishers', [
                    Object(_angular_animations__WEBPACK_IMPORTED_MODULE_2__["state"])('hidePub', Object(_angular_animations__WEBPACK_IMPORTED_MODULE_2__["style"])({
                        height: '0px',
                        overflow: 'hidden',
                        'text-overflow': 'ellipsis'
                    })),
                    Object(_angular_animations__WEBPACK_IMPORTED_MODULE_2__["state"])('showPub', Object(_angular_animations__WEBPACK_IMPORTED_MODULE_2__["style"])({})),
                    Object(_angular_animations__WEBPACK_IMPORTED_MODULE_2__["transition"])('showPub <=> hidePub', Object(_angular_animations__WEBPACK_IMPORTED_MODULE_2__["animate"])(500)),
                ])
            ]
        }),
        __metadata("design:paramtypes", [_data_access_services_data_access_service__WEBPACK_IMPORTED_MODULE_1__["DataAccessService"]])
    ], SideMenuComponent);
    return SideMenuComponent;
}());



/***/ }),

/***/ "./src/app/user-cabinet/user-cabinet.component.css":
/*!*********************************************************!*\
  !*** ./src/app/user-cabinet/user-cabinet.component.css ***!
  \*********************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "table.table-bordered > thead > tr > th{\r\n  border:2px solid dodgerblue;\r\n}\r\ntable.table-bordered > tbody > tr > td{\r\n  border:1px solid dodgerblue;\r\n}\r\na.nav-link.active{\r\n  border-top:2px solid dodgerblue;\r\n  border-left:2px solid dodgerblue;\r\n  border-right:2px solid dodgerblue;\r\n}\r\n"

/***/ }),

/***/ "./src/app/user-cabinet/user-cabinet.component.html":
/*!**********************************************************!*\
  !*** ./src/app/user-cabinet/user-cabinet.component.html ***!
  \**********************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<div class=\"card\">\r\n  <div class=\"card-header\">\r\n    User details\r\n    <div class=\"btn-group btn-group-sm float-right\">\r\n      <button type=\"button\"\r\n              class=\"btn btn-outline-primary btn-sm\"\r\n              [disabled]=\"!activeUserChanged\">\r\n        <i class=\"fa fa-floppy-o\" aria-hidden=\"true\"></i>\r\n      </button>\r\n    </div>\r\n  </div>\r\n  <div class=\"card-body\">\r\n    <div class=\"container-fluid\">\r\n      <div class=\"row\">\r\n        <div class=\"col-md-4\">\r\n          <div class=\"card card-body\">\r\n            <img src=\"{{serverURL}}photo/{{activeUserDetails.id}}\"\r\n                 width=\"100px\"\r\n                 height=\"100px\"/>\r\n            <ol class=\"list-unstyled border-primary mb-4\">\r\n              <li>Login: {{activeUserDetails.login}}</li>\r\n              <hr>\r\n              <li>Name: {{activeUserDetails.name}}</li>\r\n              <hr>\r\n              <li>Lastname: {{activeUserDetails.lastname}}</li>\r\n              <hr>\r\n              <li>Email: {{activeUserDetails.email}}</li>\r\n              <hr>\r\n              <li>Phone: {{activeUserDetails.phone}}</li>\r\n              <hr>\r\n              <li>Role: {{activeUserDetails.role}}</li>\r\n              <hr>\r\n            </ol>\r\n          </div>\r\n        </div>\r\n\r\n        <div class=\"col-md-8\">\r\n          <ul class=\"nav nav-tabs border-primary\" id=\"myTab\" role=\"tablist\">\r\n            <li class=\"nav-item\">\r\n              <a class=\"nav-link\" id=\"home-tab\" data-toggle=\"tab\" role=\"tab\"\r\n                 [ngClass]=\"{active:activeTabNum==0}\" (click)=\"setActiveTabNum(0)\">User orders</a>\r\n            </li>\r\n            <li class=\"nav-item\">\r\n              <a class=\"nav-link\" id=\"profile-tab\" data-toggle=\"tab\" role=\"tab\"\r\n                 [ngClass]=\"{active:activeTabNum==1}\" (click)=\"setActiveTabNum(1)\">Edit user profile</a>\r\n            </li>\r\n            <li class=\"nav-item \">\r\n              <a class=\"nav-link\" id=\"contact-tab\" data-toggle=\"tab\" role=\"tab\"\r\n                 [ngClass]=\"{active:activeTabNum==2}\" (click)=\"setActiveTabNum(2)\">Contact</a>\r\n            </li>\r\n          </ul>\r\n          <div class=\"tab-content\" id=\"myTabContent\">\r\n            <div class=\"tab-pane fade show active\" id=\"home\" role=\"tabpanel\"\r\n                 [ngClass]=\"{'active , show':activeTabNum==0}\" style=\"padding-top: 5px\">\r\n              <table class=\"table table-bordered table-hover\" >\r\n                <thead>\r\n                <tr>\r\n                  <th class=\"text-primary\">order Id</th>\r\n                  <th class=\"text-primary\">sum</th>\r\n                  <th class=\"text-primary\">order list</th>\r\n                  <th class=\"text-primary\">status</th>\r\n                </tr>\r\n                </thead>\r\n                <tbody>\r\n                <tr *ngFor=\"let num of iteratArray, let i=index\"\r\n                    [ngClass]=\"{collapse:(i%2!==0), show: ((i)==activeRowOrderTable), 'bg-secondary': ((i)==activeRowOrderTable-1)}\"\r\n                    (click)=\"setActiveRowOrderTable(i+1)\">\r\n                  <td *ngIf=\"(i)%2==0\">{{userDetailOrders[i/2].id}}</td>\r\n                  <td *ngIf=\"(i)%2==0\">{{userDetailOrders[i/2].orderPrice}}</td>\r\n                  <td *ngIf=\"(i)%2==0\">Order list <i style=\"color: dodgerblue\" class=\"fa fa-chevron-circle-down\"\r\n                                                     aria-hidden=\"true\"></i>\r\n                  </td>\r\n                  <td *ngIf=\"(i)%2==0\">{{userDetailOrders[i/2].status}}</td>\r\n                  <td *ngIf=\"((i)%2!==0)\" colspan=\"4\">\r\n                    <div style=\"overflow: scroll; height: 300px\">\r\n                      <table class=\"table table-bordered table-hover\">\r\n                        <thead>\r\n                        <tr>\r\n                          <th>Book id</th>\r\n                          <th>Book name</th>\r\n                          <th>Book quantity</th>\r\n                        </tr>\r\n                        </thead>\r\n                        <tbody>\r\n                        <tr *ngFor=\"let itemEntry of userDetailOrders[(i-1)/2].orderList, let j=index\" [ngClass]=\"{collapse:((i+1)%2==0),\r\n                          show: ((i)==activeRowOrderTable)}\">\r\n                          <td>{{itemEntry.key.id}}</td>\r\n                          <td>{{itemEntry.key.bookName}}</td>\r\n                          <td>{{itemEntry.value}}</td>\r\n                        </tr>\r\n                        </tbody>\r\n                      </table>\r\n                    </div>\r\n                  </td>\r\n                </tr>\r\n                </tbody>\r\n              </table>\r\n            </div>\r\n            <div class=\"tab-pane fade\" id=\"profile\" role=\"tabpanel\"\r\n                 [ngClass]=\"{'active , show':activeTabNum==1}\">\r\n              <form (ngSubmit)=\"onSubmitUser(f)\" #f=\"ngForm\">\r\n\r\n                <label for=\"login\">Login</label>\r\n                <input type=\"text\" class=\"form-control\"\r\n                       placeholder=\"{{activeUserDetails.login}}\"\r\n                       [(ngModel)]=\"activeUserDetails.login\" name=\"login\" id=\"login\" required>\r\n\r\n                <label for=\"email\">email</label>\r\n                <input type=\"email\" class=\"form-control\" id=\"email\"\r\n                       placeholder=\"{{activeUserDetails.email}}\"\r\n                       [(ngModel)]=\"activeUserDetails.email\" name=\"email\" email required>\r\n\r\n                <label for=\"phone\">phone</label>\r\n                <input type=\"text\" class=\"form-control\" id=\"phone\"\r\n                       placeholder=\"{{activeUserDetails.phone}}\"\r\n                       [(ngModel)]=\"activeUserDetails.phone\" name=\"phone\" required>\r\n                <hr>\r\n                <label for=\"adress\">adress</label>\r\n                <input type=\"text\" class=\"form-control\" id=\"adress\"\r\n                       placeholder=\"{{activeUserDetails.adress}}\"\r\n                       [(ngModel)]=\"activeUserDetails.adress\" name=\"address\">\r\n\r\n                <label for=\"name\">name</label>\r\n                <input type=\"text\" class=\"form-control\" id=\"name\"\r\n                       placeholder=\"{{activeUserDetails.name}}\"\r\n                       [(ngModel)]=\"activeUserDetails.name\" name=\"name\">\r\n                <label for=\"lastname\">Lastname</label>\r\n                <input type=\"text\" class=\"form-control\" id=\"lastname\"\r\n                       placeholder=\"{{activeUserDetails.lastname}}\"\r\n                       [(ngModel)]=\"activeUserDetails.lastname\" name=\"lastname\">\r\n\r\n                <hr>\r\n                <div class=\"form-row\">\r\n                  <div class=\"col\">\r\n                    <label for=\"password\">password</label>\r\n                    <input type=\"password\" class=\"form-control\" placeholder=\"password\"\r\n                           ngModel name=\"password\" #password=\"ngModel\"\r\n                           pattern=\"{{confirmPasswordProp}}\" [required]=\"confirm.value!=''\"\r\n                           id=\"password\">\r\n                  </div>\r\n                  <div class=\"col\">\r\n                    <label for=\"confirmPassword\">confirm password</label>\r\n                    <input type=\"password\" class=\"form-control\" placeholder=\"confirm password\"\r\n                           [(ngModel)]=\"confirmPasswordProp\" name=\"confirmPassword\" #confirm=\"ngModel\"\r\n                           [required]=\"password.value!=''\" id=\"confirmPassword\">\r\n                  </div>\r\n                </div>\r\n                <hr>\r\n                <label for=\"avatar\">avatar</label>\r\n                <input type=\"file\" name=\"photo\" (change)=\"addPhoto($event)\" id=\"avatar\"/>\r\n                <hr>\r\n                <button type=\"submit\" class=\"btn btn-outline-primary btn-sm\"\r\n                        [disabled]=\"!f.valid || !password.valid\">submit\r\n                </button>\r\n              </form>\r\n            </div>\r\n            <div class=\"tab-pane fade\" id=\"contact\" role=\"tabpanel\"\r\n                 [ngClass]=\"{'active , show':activeTabNum==2}\">\r\n              <form>\r\n                <div class=\"form-group\">\r\n                  <label for=\"exampleInputEmail1\">Email address</label>\r\n                  <input type=\"email\" class=\"form-control \" readonly=\"true\" id=\"exampleInputEmail1\"\r\n                         aria-describedby=\"emailHelp\" placeholder=\"yyyy\" name=\"toClient\" value=\"email\">\r\n                  <small id=\"emailHelp\" class=\"form-text text-muted\">We'll never\r\n                    share your email with anyone else.\r\n                  </small>\r\n                </div>\r\n                <div class=\"form-group\">\r\n                  <label for=\"subjectId\">Subject</label>\r\n                  <input type=\"text\" class=\"form-control\" id=\"subjectId\"\r\n                         aria-describedby=\"emailHelp\" placeholder=\"Subject\"\r\n                         name=\"subject\">\r\n                </div>\r\n                <div class=\"form-group\">\r\n                  <label for=\"exampleInputPassword1\">Message</label>\r\n                  <textarea class=\"form-control\" id=\"exampleInputPassword1\"\r\n                            placeholder=\"Enter message here\"\r\n                            name=\"text\"></textarea>\r\n                  <!--<input type=\"text\" class=\"form-control\" id=\"exampleInputPassword1\" placeholder=\"Password\">-->\r\n                </div>\r\n                <button type=\"submit\" class=\"btn btn-primary\">Send email</button>\r\n              </form>\r\n            </div>\r\n          </div>\r\n        </div>\r\n      </div>\r\n    </div>\r\n  </div>\r\n</div>\r\n<ng-template #userCreated let-modal>\r\n  <div class=\"modal-body\">\r\n    {{createUserReply}}\r\n  </div>\r\n  <div class=\"modal-footer\">\r\n    <button type=\"button\" class=\"btn btn-outline-dark\" (click)=\"modal.close()\">Close</button>\r\n  </div>\r\n</ng-template>\r\n\r\n"

/***/ }),

/***/ "./src/app/user-cabinet/user-cabinet.component.ts":
/*!********************************************************!*\
  !*** ./src/app/user-cabinet/user-cabinet.component.ts ***!
  \********************************************************/
/*! exports provided: UserCabinetComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "UserCabinetComponent", function() { return UserCabinetComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _data_access_services_data_access_service__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! ../data-access-services/data-access.service */ "./src/app/data-access-services/data-access.service.ts");
/* harmony import */ var _ng_bootstrap_ng_bootstrap__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @ng-bootstrap/ng-bootstrap */ "./node_modules/@ng-bootstrap/ng-bootstrap/fesm5/ng-bootstrap.js");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm5/router.js");
/* harmony import */ var _environments_environment__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! ../../environments/environment */ "./src/environments/environment.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};





var UserCabinetComponent = /** @class */ (function () {
    function UserCabinetComponent(dataAccessService, modalService, route) {
        this.dataAccessService = dataAccessService;
        this.modalService = modalService;
        this.route = route;
        this.serverURL = _environments_environment__WEBPACK_IMPORTED_MODULE_4__["environment"].serverURL;
        this.userOrdersOutput = new _angular_core__WEBPACK_IMPORTED_MODULE_0__["EventEmitter"]();
        this.confirmPasswordProp = '';
        this.createUserReply = '';
    }
    UserCabinetComponent.prototype.ngOnInit = function () {
        var _this = this;
        this.userDetailsSubscription = this.dataAccessService.loggedUserChanged
            .subscribe(function (user) {
            _this.activeUserDetails = user;
        });
        this.userDetailsOrdersSubscription = this.dataAccessService.loggedUserOrdersChanged
            .subscribe(function (orders) {
            _this.userDetailOrders = orders;
        });
        this.activeUserDetails = this.dataAccessService.loggedUser;
        this.userDetailOrders = this.dataAccessService.loggedUserOrders;
        this.activeRowOrderTable = -1;
        this.activeUserChanged = false;
        this.activeTabNum = 0;
        this.iteratArray = Array(this.userDetailOrders.length * 2).fill(0).map(function (x, i) { return i; });
        // this.userDetailsOrdersSubscription = this.userService.userDetailsOrdersChanged.subscribe((orders: Order[]) => {
        //   this.userDetailOrders = orders;
        // });
    };
    UserCabinetComponent.prototype.ngOnChanges = function (changes) {
        var _this = this;
        var activeUsId = this.activeUserDetails.id;
        var reqUrl = this.serverURL + 'orders?userId=' + activeUsId;
        this.dataAccessService.getUserDetailsOrders2(reqUrl).subscribe(function (orders) {
            _this.userDetailOrders = orders;
            _this.userOrdersOutput.emit(orders);
            _this.iteratArray = Array(_this.userDetailOrders.length * 2).fill(0).map(function (x, i) { return i; });
            // console.log(this.iteratArray);
        });
    };
    UserCabinetComponent.prototype.setActiveRowOrderTable = function (rowIndex) {
        if (this.activeRowOrderTable === rowIndex) {
            this.activeRowOrderTable = -1;
        }
        else {
            this.activeRowOrderTable = rowIndex;
        }
    };
    UserCabinetComponent.prototype.setActiveTabNum = function (tabNum) {
        this.activeTabNum = tabNum;
    };
    UserCabinetComponent.prototype.addPhoto = function (event) {
        var target = event.target || event.srcElement;
        this.files = target.files;
    };
    UserCabinetComponent.prototype.onSubmitUser = function (form) {
        var _this = this;
        console.log(form);
        var final_data;
        var formData = new FormData();
        if (this.files != null) {
            var files = this.files;
            for (var i = 0; i < files.length; i++) {
                formData.append('photo', files[i]);
            }
        }
        formData.append('login', form.value.login);
        formData.append('email', form.value.email);
        formData.append('phone', form.value.phone);
        formData.append('address', form.value.address);
        formData.append('name', form.value.name);
        formData.append('lastname', form.value.lastname);
        formData.append('password', form.value.password);
        formData.append('updateUser', 'true');
        formData.append('id', this.activeUserDetails.id.toString());
        final_data = formData;
        // } else {
        //   // Если нет файла, то слать как обычный JSON
        //   final_data = form.value;
        // }
        this.dataAccessService.createNewUser(final_data).subscribe(function (response) {
            console.log(response);
            if (response.status === 200) {
                var serverReply = response.json();
                _this.createUserReply = serverReply[0];
                _this.openAddUserModal(_this.userCreated);
            }
        });
    };
    UserCabinetComponent.prototype.openAddUserModal = function (addUserModal) {
        this.modalService.open(addUserModal);
    };
    __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Output"])(),
        __metadata("design:type", Object)
    ], UserCabinetComponent.prototype, "userOrdersOutput", void 0);
    __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["ViewChild"])('userCreated'),
        __metadata("design:type", Object)
    ], UserCabinetComponent.prototype, "userCreated", void 0);
    UserCabinetComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-user-cabinet',
            template: __webpack_require__(/*! ./user-cabinet.component.html */ "./src/app/user-cabinet/user-cabinet.component.html"),
            styles: [__webpack_require__(/*! ./user-cabinet.component.css */ "./src/app/user-cabinet/user-cabinet.component.css")]
        }),
        __metadata("design:paramtypes", [_data_access_services_data_access_service__WEBPACK_IMPORTED_MODULE_1__["DataAccessService"],
            _ng_bootstrap_ng_bootstrap__WEBPACK_IMPORTED_MODULE_2__["NgbModal"],
            _angular_router__WEBPACK_IMPORTED_MODULE_3__["ActivatedRoute"]])
    ], UserCabinetComponent);
    return UserCabinetComponent;
}());



/***/ }),

/***/ "./src/environments/environment.ts":
/*!*****************************************!*\
  !*** ./src/environments/environment.ts ***!
  \*****************************************/
/*! exports provided: environment */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "environment", function() { return environment; });
// This file can be replaced during build by using the `fileReplacements` array.
// `ng build --prod` replaces `environment.ts` with `environment.prod.ts`.
// The list of file replacements can be found in `angular.json`.
var environment = {
    production: false,
    serverURL: 'http://localhost:8080/'
};
/*
 * For easier debugging in development mode, you can import the following file
 * to ignore zone related error stack frames such as `zone.run`, `zoneDelegate.invokeTask`.
 *
 * This import should be commented out in production mode because it will have a negative impact
 * on performance if an error is thrown.
 */
// import 'zone.js/dist/zone-error';  // Included with Angular CLI.


/***/ }),

/***/ "./src/main.ts":
/*!*********************!*\
  !*** ./src/main.ts ***!
  \*********************/
/*! no exports provided */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_platform_browser_dynamic__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/platform-browser-dynamic */ "./node_modules/@angular/platform-browser-dynamic/fesm5/platform-browser-dynamic.js");
/* harmony import */ var _app_app_module__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ./app/app.module */ "./src/app/app.module.ts");
/* harmony import */ var _environments_environment__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ./environments/environment */ "./src/environments/environment.ts");




if (_environments_environment__WEBPACK_IMPORTED_MODULE_3__["environment"].production) {
    Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["enableProdMode"])();
}
Object(_angular_platform_browser_dynamic__WEBPACK_IMPORTED_MODULE_1__["platformBrowserDynamic"])().bootstrapModule(_app_app_module__WEBPACK_IMPORTED_MODULE_2__["AppModule"])
    .catch(function (err) { return console.log(err); });


/***/ }),

/***/ 0:
/*!***************************!*\
  !*** multi ./src/main.ts ***!
  \***************************/
/*! no static exports found */
/***/ (function(module, exports, __webpack_require__) {

module.exports = __webpack_require__(/*! C:\Users\HOME\Documents\git\AngularProgects\AngularProgects\bookstore3\src\main.ts */"./src/main.ts");


/***/ })

},[[0,"runtime","vendor"]]]);
//# sourceMappingURL=main.js.map