(self.webpackChunk_N_E=self.webpackChunk_N_E||[]).push([[680],{6145:function(n,e,t){(window.__NEXT_P=window.__NEXT_P||[]).push(["/interest",function(){return t(3944)}])},3944:function(n,e,t){"use strict";t.r(e),t.d(e,{default:function(){return I}});var r=t(5893),o=t(7294),i=t(1163),a=t(2912),u=t(4541),s=t(9205);function c(n,e){return e||(e=n.slice(0)),Object.freeze(Object.defineProperties(n,{raw:{value:Object.freeze(e)}}))}function l(){var n=c(["\n  display: flex;\n  flex-direction: column;\n  justify-content: center;\n"]);return l=function(){return n},n}function f(){var n=c(["\n  background-color: #fff;\n"]);return f=function(){return n},n}function m(){var n=c(["\n  flex: 1;\n  padding: 3vh;\n  letter-spacing: 0.5rem;\n\n  &.left {\n    text-align: left;\n  }\n\n  &.right {\n    text-align: right;\n  }\n"]);return m=function(){return n},n}function N(){var n=c(["\n  display: flex;\n  box-sizing: border-box;\n  flex-wrap: wrap;\n  justify-content: center;\n  overflow: auto;\n  margin: 5vh;\n  -ms-overflow-style: none; /* IE and Edge */\n  scrollbar-width: none; /* Firefox */\n\n  &::-webkit-scrollbar {\n    display: none; /* Chrome, Safari, Opera*/\n  }\n"]);return N=function(){return n},n}function d(){var n=c(["\n  background-color: #fff;\n  margin: 3px;\n\n  & input:checked & {\n    background-color: #000;\n    color: #fff;\n  }\n"]);return d=function(){return n},n}var h=(0,a.Z)(u.tz)(l()),p=(0,a.Z)(u.bk)(f()),v=(0,a.Z)(u.zx)(m()),x={MainContainer:h,InterestContainer:a.Z.div(N()),CheckInputFormGroup:(0,a.Z)(s.q3)(d()),ButtonContainer:p,Button:v},b=t(7249),y=t(5979),g=t(5617);function j(n,e){(null==e||e>n.length)&&(e=n.length);for(var t=0,r=new Array(e);t<e;t++)r[t]=n[t];return r}function k(n,e){return function(n){if(Array.isArray(n))return n}(n)||function(n,e){var t=null==n?null:"undefined"!==typeof Symbol&&n[Symbol.iterator]||n["@@iterator"];if(null!=t){var r,o,i=[],a=!0,u=!1;try{for(t=t.call(n);!(a=(r=t.next()).done)&&(i.push(r.value),!e||i.length!==e);a=!0);}catch(s){u=!0,o=s}finally{try{a||null==t.return||t.return()}finally{if(u)throw o}}return i}}(n,e)||function(n,e){if(!n)return;if("string"===typeof n)return j(n,e);var t=Object.prototype.toString.call(n).slice(8,-1);"Object"===t&&n.constructor&&(t=n.constructor.name);if("Map"===t||"Set"===t)return Array.from(t);if("Arguments"===t||/^(?:Ui|I)nt(?:8|16|32)(?:Clamped)?Array$/.test(t))return j(n,e)}(n,e)||function(){throw new TypeError("Invalid attempt to destructure non-iterable instance.\\nIn order to be iterable, non-array objects must have a [Symbol.iterator]() method.")}()}var w=[{no:0,interestName:"\uc5ec\ud589"},{no:1,interestName:"\ube44\uc988\ub2c8\uc2a4"},{no:2,interestName:"\ud788\ud788\ud788"},{no:3,interestName:"\ud5e4\ud5e4"},{no:4,interestName:"\uc624\uc624\uc624\uc624\uc624\uc624"},{no:5,interestName:"\ud558\uc704\uc774\uc774\uc789"},{no:6,interestName:"\uc548\ub18d"},{no:7,interestName:"\uc76d"},{no:8,interestName:"\uc774\uc774\u3163\uc774"},{no:9,interestName:"\uc139 \uc2dc \uc6b0 \uba3c"},{no:10,interestName:"\uacf5\ubd80\uacf5\ubd80"},{no:11,interestName:"\uacf5\ubd80"},{no:12,interestName:"\ud654\uc774\ud305"},{no:13,interestName:"\uc0c8\ud574 \ubcf5"},{no:14,interestName:"\ud79b"},{no:15,interestName:"\uaca8\uc6b8"},{no:16,interestName:"\uc5ec\ud589"},{no:17,interestName:"\ube44\uc988\ub2c8\uc2a4"},{no:18,interestName:"\ud788\ud788\ud788"},{no:19,interestName:"\ud5e4\ud5e4"},{no:20,interestName:"\uc624\uc624\uc624\uc624\uc624\uc624"},{no:21,interestName:"\ud558\uc704\uc774\uc774\uc789"},{no:22,interestName:"\uc548\ub18d"},{no:23,interestName:"\uc76d"},{no:24,interestName:"\uc774\uc774\u3163\uc774"},{no:25,interestName:"\uc139 \uc2dc \uc6b0 \uba3c"},{no:26,interestName:"\uacf5\ubd80\uacf5\ubd80"},{no:27,interestName:"\uacf5\ubd80"},{no:28,interestName:"\ud654\uc774\ud305"},{no:29,interestName:"\uc0c8\ud574 \ubcf5"},{no:30,interestName:"\ud79b"},{no:31,interestName:"\uaca8\uc6b8"}],C=function(){var n=(0,g.I0)(),e=k((0,b.w6)([]),3),t=e[0],a=e[2],c=(0,o.useCallback)((function(n){return t.filter((function(e){return parseInt(e,10)===n})).length>0}),[t]),l=(0,o.useCallback)((function(){i.default.push("/signup/success")}),[]),f=(0,o.useCallback)((function(){n((0,y.sL)(t)),i.default.push("/type")}),[t]);return(0,r.jsxs)(x.MainContainer,{children:[(0,r.jsx)(s.Dx,{value:"INTEREST"}),(0,r.jsx)(x.InterestContainer,{children:w.map((function(n){return(0,r.jsx)(x.CheckInputFormGroup,{type:"checkbox",value:n.no,checked:c(n.no),name:"interest",onChange:a,children:(0,r.jsx)(u.xv,{value:n.interestName})},n.no)}))}),(0,r.jsxs)(x.ButtonContainer,{children:[(0,r.jsx)(x.Button,{className:"left",onClick:l,children:(0,r.jsx)(u.xv,{value:"SKIP"})}),(0,r.jsx)(x.Button,{className:"right",onClick:f,children:(0,r.jsx)(u.xv,{value:"NEXT"})})]})]})},I=function(){return(0,r.jsx)(C,{})}}},function(n){n.O(0,[774,941,216,888,179],(function(){return e=6145,n(n.s=e);var e}));var e=n.O();_N_E=e}]);