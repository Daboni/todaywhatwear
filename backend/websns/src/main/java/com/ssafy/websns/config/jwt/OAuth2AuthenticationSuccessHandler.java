//package com.ssafy.websns.config.jwt;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
//import org.springframework.stereotype.Component;
//
//@Component
//@RequiredArgsConstructor
//public class OAuth2AuthenticationSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {
//
//  private final JwtTokenProvider tokenProvider;
//
//  private final AppProperties appProperties;
//
//  private final HttpCookieOAuth2AuthorizationRequestRepository httpCookieOAuth2AuthorizationRequestRepository;
//
//  @Override
//  public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
//    String targetUrl = determineTargetUrl(request, response, authentication);
//
//    if (response.isCommitted()) {
//      logger.debug("Response has already been committed. Unable to redirect to " + targetUrl);
//      return;
//    }
//
//    clearAuthenticationAttributes(request, response);
//    getRedirectStrategy().sendRedirect(request, response, targetUrl);
//  }
//
//  protected String determineTargetUrl(HttpServletRequest request, HttpServletResponse response, Authentication authentication) {
//    Optional<String> redirectUri = CookieUtils.getCookie(request, REDIRECT_URI_PARAM_COOKIE_NAME)
//        .map(Cookie::getValue);
//
//    if(redirectUri.isPresent() && !isAuthorizedRedirectUri(redirectUri.get())) {
//      throw new BadRequestException("Sorry! We've got an Unauthorized Redirect URI and can't proceed with the authentication");
//    }
//
//    String targetUrl = redirectUri.orElse(getDefaultTargetUrl());
//
//    String token = tokenProvider.createToken(authentication);
//
//    return UriComponentsBuilder.fromUriString(targetUrl)
//        .queryParam("token", token)
//        .build().toUriString();
//  }
//
//  protected void clearAuthenticationAttributes(HttpServletRequest request, HttpServletResponse response) {
//    super.clearAuthenticationAttributes(request);
//    httpCookieOAuth2AuthorizationRequestRepository.removeAuthorizationRequestCookies(request, response);
//  }
//
//  private boolean isAuthorizedRedirectUri(String uri) {
//    URI clientRedirectUri = URI.create(uri);
//
//    return appProperties.getOauth2().getAuthorizedRedirectUris()
//        .stream()
//        .anyMatch(authorizedRedirectUri -> {
//          // Only validate host and port. Let the clients use different paths if they want to
//          URI authorizedURI = URI.create(authorizedRedirectUri);
//          if(authorizedURI.getHost().equalsIgnoreCase(clientRedirectUri.getHost())
//              && authorizedURI.getPort() == clientRedirectUri.getPort()) {
//            return true;
//          }
//          return false;
//        });
//  }
//}