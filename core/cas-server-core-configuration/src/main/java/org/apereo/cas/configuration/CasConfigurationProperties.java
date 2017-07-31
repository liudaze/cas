package org.apereo.cas.configuration;

import org.apereo.cas.configuration.model.core.CasServerProperties;
import org.apereo.cas.configuration.model.core.HostProperties;
import org.apereo.cas.configuration.model.core.audit.AuditProperties;
import org.apereo.cas.configuration.model.core.authentication.AuthenticationProperties;
import org.apereo.cas.configuration.model.core.authentication.HttpClientProperties;
import org.apereo.cas.configuration.model.core.authentication.PersonDirPrincipalResolverProperties;
import org.apereo.cas.configuration.model.core.events.EventsProperties;
import org.apereo.cas.configuration.model.core.logout.LogoutProperties;
import org.apereo.cas.configuration.model.core.metrics.MetricsProperties;
import org.apereo.cas.configuration.model.core.monitor.MonitorProperties;
import org.apereo.cas.configuration.model.core.rest.RestProperties;
import org.apereo.cas.configuration.model.core.services.ServiceRegistryProperties;
import org.apereo.cas.configuration.model.core.slo.SloProperties;
import org.apereo.cas.configuration.model.core.sso.SsoProperties;
import org.apereo.cas.configuration.model.core.util.TicketProperties;
import org.apereo.cas.configuration.model.core.web.MessageBundleProperties;
import org.apereo.cas.configuration.model.core.web.security.AdminPagesSecurityProperties;
import org.apereo.cas.configuration.model.core.web.security.HttpWebRequestProperties;
import org.apereo.cas.configuration.model.core.web.view.ViewProperties;
import org.apereo.cas.configuration.model.support.analytics.GoogleAnalyticsProperties;
import org.apereo.cas.configuration.model.support.aup.AcceptableUsagePolicyProperties;
import org.apereo.cas.configuration.model.support.captcha.GoogleRecaptchaProperties;
import org.apereo.cas.configuration.model.support.clearpass.ClearpassProperties;
import org.apereo.cas.configuration.model.support.consent.ConsentProperties;
import org.apereo.cas.configuration.model.support.cookie.TicketGrantingCookieProperties;
import org.apereo.cas.configuration.model.support.cookie.WarningCookieProperties;
import org.apereo.cas.configuration.model.support.geo.googlemaps.GoogleMapsProperties;
import org.apereo.cas.configuration.model.support.geo.maxmind.MaxmindProperties;
import org.apereo.cas.configuration.model.support.jpa.DatabaseProperties;
import org.apereo.cas.configuration.model.support.saml.SamlCoreProperties;
import org.apereo.cas.configuration.model.support.saml.googleapps.GoogleAppsProperties;
import org.apereo.cas.configuration.model.support.saml.mdui.SamlMetadataUIProperties;
import org.apereo.cas.configuration.model.support.saml.shibboleth.ShibbolethAttributeResolverProperties;
import org.apereo.cas.configuration.model.support.saml.sps.SamlServiceProviderProperties;
import org.apereo.cas.configuration.model.support.scim.ScimProperties;
import org.apereo.cas.configuration.model.support.sms.ClickatellProperties;
import org.apereo.cas.configuration.model.support.sms.TextMagicProperties;
import org.apereo.cas.configuration.model.support.sms.TwillioProperties;
import org.apereo.cas.configuration.model.support.themes.ThemeProperties;
import org.apereo.cas.configuration.model.webapp.LocaleProperties;
import org.apereo.cas.configuration.model.webapp.WebflowProperties;
import org.apereo.cas.configuration.model.webapp.mgmt.ManagementWebappProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

/**
 * This is {@link CasConfigurationProperties}.
 *
 * @author Misagh Moayyed
 * @since 5.0.0
 */
@ConfigurationProperties(value = "cas")
public class CasConfigurationProperties {

    /**
     * Consent related properties.
     */
    @NestedConfigurationProperty
    private ConsentProperties consent = new ConsentProperties();

    /**
     * Scim related properties.
     */
    @NestedConfigurationProperty
    private ScimProperties scim = new ScimProperties();

    /**
     * Authentication related properties.
     */
    @NestedConfigurationProperty
    private AuthenticationProperties authn = new AuthenticationProperties();

    /**
     * Audit related properties.
     */
    @NestedConfigurationProperty
    private AuditProperties audit = new AuditProperties();

    /**
     * Audit related properties.
     */
    @NestedConfigurationProperty
    private HttpClientProperties httpClient = new HttpClientProperties();

    /**
     * Person directory related properties.
     */
    @NestedConfigurationProperty
    private PersonDirPrincipalResolverProperties personDirectory = new PersonDirPrincipalResolverProperties();

    /**
     * CAS events related properties.
     */
    @NestedConfigurationProperty
    private EventsProperties events = new EventsProperties();

    /**
     * Host related properties.
     */
    @NestedConfigurationProperty
    private HostProperties host = new HostProperties();

    /**
     * Logout related properties.
     */
    @NestedConfigurationProperty
    private LogoutProperties logout = new LogoutProperties();

    /**
     * Metrics related properties.
     */
    @NestedConfigurationProperty
    private MetricsProperties metrics = new MetricsProperties();

    /**
     * Monitor related properties.
     */
    @NestedConfigurationProperty
    private MonitorProperties monitor = new MonitorProperties();

    /**
     * REST related properties.
     */
    @NestedConfigurationProperty
    private RestProperties rest = new RestProperties();

    /**
     * HTTP server related properties.
     */
    @NestedConfigurationProperty
    private CasServerProperties server = new CasServerProperties();

    /**
     * Service Registry related properties.
     */
    @NestedConfigurationProperty
    private ServiceRegistryProperties serviceRegistry = new ServiceRegistryProperties();

    /**
     * Single logout related properties.
     */
    @NestedConfigurationProperty
    private SloProperties slo = new SloProperties();

    /**
     * Single Sign On related properties.
     */
    @NestedConfigurationProperty
    private SsoProperties sso = new SsoProperties();

    /**
     * Tickets related properties.
     */
    @NestedConfigurationProperty
    private TicketProperties ticket = new TicketProperties();

    /**
     * Message bundle and internationalization related properties.
     */
    @NestedConfigurationProperty
    private MessageBundleProperties messageBundle = new MessageBundleProperties();

    /**
     * Admin pages related properties.
     */
    @NestedConfigurationProperty
    private AdminPagesSecurityProperties adminPagesSecurity = new AdminPagesSecurityProperties();

    /**
     * HTTP web requests related properties.
     */
    @NestedConfigurationProperty
    private HttpWebRequestProperties httpWebRequest = new HttpWebRequestProperties();

    /**
     * CAS view layer related properties related properties.
     */
    @NestedConfigurationProperty
    private ViewProperties view = new ViewProperties();

    /**
     * Google analytics related properties.
     */
    @NestedConfigurationProperty
    private GoogleAnalyticsProperties googleAnalytics = new GoogleAnalyticsProperties();

    /**
     * Google recaptcha related properties.
     */
    @NestedConfigurationProperty
    private GoogleRecaptchaProperties googleRecaptcha = new GoogleRecaptchaProperties();

    /**
     * Twillio related properties.
     */
    @NestedConfigurationProperty
    private TwillioProperties twillio = new TwillioProperties();

    /**
     * Text magic related properties.
     */
    @NestedConfigurationProperty
    private TextMagicProperties textMagic = new TextMagicProperties();

    /**
     * Clickatell related properties.
     */
    @NestedConfigurationProperty
    private ClickatellProperties clickatell = new ClickatellProperties();

    /**
     * Acceptable usage policy related properties.
     */
    @NestedConfigurationProperty
    private AcceptableUsagePolicyProperties acceptableUsagePolicy = new AcceptableUsagePolicyProperties();

    /**
     * Clearpass related properties.
     */
    @NestedConfigurationProperty
    private ClearpassProperties clearpass = new ClearpassProperties();

    /**
     * Ticket Granting Ticket Cookie related properties.
     */
    @NestedConfigurationProperty
    private TicketGrantingCookieProperties tgc = new TicketGrantingCookieProperties();

    /**
     * Warning Cookie related properties.
     */
    @NestedConfigurationProperty
    private WarningCookieProperties warningCookie = new WarningCookieProperties();

    /**
     * SAML SP related properties.
     */
    @NestedConfigurationProperty
    private SamlServiceProviderProperties samlSp = new SamlServiceProviderProperties();

    /**
     * Maxmind related properties.
     */
    @NestedConfigurationProperty
    private MaxmindProperties maxmind = new MaxmindProperties();

    /**
     * Google maps related properties.
     */
    @NestedConfigurationProperty
    private GoogleMapsProperties googleMaps = new GoogleMapsProperties();

    /**
     * JDBC related properties.
     */
    @NestedConfigurationProperty
    private DatabaseProperties jdbc = new DatabaseProperties();

    /**
     * Google apps related properties.
     */
    @NestedConfigurationProperty
    private GoogleAppsProperties googleApps = new GoogleAppsProperties();

    /**
     * SAML MDUI related properties.
     */
    @NestedConfigurationProperty
    private SamlMetadataUIProperties samlMetadataUi = new SamlMetadataUIProperties();

    /**
     * SAML core related properties.
     */
    @NestedConfigurationProperty
    private SamlCoreProperties samlCore = new SamlCoreProperties();

    /**
     * Shibboleth attribute resolver related properties.
     */
    @NestedConfigurationProperty
    private ShibbolethAttributeResolverProperties shibAttributeResolver = new ShibbolethAttributeResolverProperties();

    /**
     * UI theme related properties.
     */
    @NestedConfigurationProperty
    private ThemeProperties theme = new ThemeProperties();

    /**
     * Locale related properties.
     */
    @NestedConfigurationProperty
    private LocaleProperties locale = new LocaleProperties();

    /**
     * Management web application  related properties.
     */
    @NestedConfigurationProperty
    private ManagementWebappProperties mgmt = new ManagementWebappProperties();

    /**
     * Spring Webflow related properties.
     */
    @NestedConfigurationProperty
    private WebflowProperties webflow = new WebflowProperties();

    public ConsentProperties getConsent() {
        return consent;
    }

    public void setConsent(final ConsentProperties consent) {
        this.consent = consent;
    }

    public AuditProperties getAudit() {
        return audit;
    }

    public void setAudit(final AuditProperties audit) {
        this.audit = audit;
    }

    public HttpClientProperties getHttpClient() {
        return httpClient;
    }

    public void setHttpClient(final HttpClientProperties httpClient) {
        this.httpClient = httpClient;
    }

    public PersonDirPrincipalResolverProperties getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(final PersonDirPrincipalResolverProperties personDirectory) {
        this.personDirectory = personDirectory;
    }

    public RestProperties getRest() {
        return rest;
    }

    public void setRest(final RestProperties rest) {
        this.rest = rest;
    }

    public EventsProperties getEvents() {
        return events;
    }

    public void setEvents(final EventsProperties events) {
        this.events = events;
    }

    public HostProperties getHost() {
        return host;
    }

    public void setHost(final HostProperties host) {
        this.host = host;
    }

    public LogoutProperties getLogout() {
        return logout;
    }

    public void setLogout(final LogoutProperties logout) {
        this.logout = logout;
    }

    public MetricsProperties getMetrics() {
        return metrics;
    }

    public void setMetrics(final MetricsProperties metrics) {
        this.metrics = metrics;
    }

    public MonitorProperties getMonitor() {
        return monitor;
    }

    public void setMonitor(final MonitorProperties monitor) {
        this.monitor = monitor;
    }

    public CasServerProperties getServer() {
        return server;
    }

    public void setServer(final CasServerProperties server) {
        this.server = server;
    }

    public ServiceRegistryProperties getServiceRegistry() {
        return serviceRegistry;
    }

    public void setServiceRegistry(final ServiceRegistryProperties serviceRegistry) {
        this.serviceRegistry = serviceRegistry;
    }

    public SloProperties getSlo() {
        return slo;
    }

    public void setSlo(final SloProperties slo) {
        this.slo = slo;
    }

    public SsoProperties getSso() {
        return sso;
    }

    public void setSso(final SsoProperties sso) {
        this.sso = sso;
    }

    public TicketProperties getTicket() {
        return ticket;
    }

    public void setTicket(final TicketProperties ticket) {
        this.ticket = ticket;
    }

    public MessageBundleProperties getMessageBundle() {
        return messageBundle;
    }

    public void setMessageBundle(final MessageBundleProperties messageBundle) {
        this.messageBundle = messageBundle;
    }

    public AdminPagesSecurityProperties getAdminPagesSecurity() {
        return adminPagesSecurity;
    }

    public void setAdminPagesSecurity(final AdminPagesSecurityProperties adminPagesSecurity) {
        this.adminPagesSecurity = adminPagesSecurity;
    }

    public HttpWebRequestProperties getHttpWebRequest() {
        return httpWebRequest;
    }

    public void setHttpWebRequest(final HttpWebRequestProperties httpWebRequest) {
        this.httpWebRequest = httpWebRequest;
    }

    public ViewProperties getView() {
        return view;
    }

    public void setView(final ViewProperties view) {
        this.view = view;
    }

    public GoogleAnalyticsProperties getGoogleAnalytics() {
        return googleAnalytics;
    }

    public void setGoogleAnalytics(final GoogleAnalyticsProperties googleAnalytics) {
        this.googleAnalytics = googleAnalytics;
    }

    public AcceptableUsagePolicyProperties getAcceptableUsagePolicy() {
        return acceptableUsagePolicy;
    }

    public void setAcceptableUsagePolicy(final AcceptableUsagePolicyProperties acceptableUsagePolicy) {
        this.acceptableUsagePolicy = acceptableUsagePolicy;
    }

    public ClearpassProperties getClearpass() {
        return clearpass;
    }

    public void setClearpass(final ClearpassProperties clearpass) {
        this.clearpass = clearpass;
    }

    public TicketGrantingCookieProperties getTgc() {
        return tgc;
    }

    public void setTgc(final TicketGrantingCookieProperties tgc) {
        this.tgc = tgc;
    }

    public WarningCookieProperties getWarningCookie() {
        return warningCookie;
    }

    public void setWarningCookie(final WarningCookieProperties warningCookie) {
        this.warningCookie = warningCookie;
    }

    public MaxmindProperties getMaxmind() {
        return maxmind;
    }

    public void setMaxmind(final MaxmindProperties maxmind) {
        this.maxmind = maxmind;
    }

    public DatabaseProperties getJdbc() {
        return jdbc;
    }

    public void setJdbc(final DatabaseProperties jdbc) {
        this.jdbc = jdbc;
    }

    public GoogleAppsProperties getGoogleApps() {
        return googleApps;
    }

    public void setGoogleApps(final GoogleAppsProperties googleApps) {
        this.googleApps = googleApps;
    }

    public SamlMetadataUIProperties getSamlMetadataUi() {
        return samlMetadataUi;
    }

    public void setSamlMetadataUi(final SamlMetadataUIProperties samlMetadataUi) {
        this.samlMetadataUi = samlMetadataUi;
    }

    public SamlCoreProperties getSamlCore() {
        return samlCore;
    }

    public void setSamlCore(final SamlCoreProperties samlCore) {
        this.samlCore = samlCore;
    }

    public ShibbolethAttributeResolverProperties getShibAttributeResolver() {
        return shibAttributeResolver;
    }

    public void setShibAttributeResolver(final ShibbolethAttributeResolverProperties shibAttributeResolver) {
        this.shibAttributeResolver = shibAttributeResolver;
    }

    public ThemeProperties getTheme() {
        return theme;
    }

    public void setTheme(final ThemeProperties theme) {
        this.theme = theme;
    }

    public LocaleProperties getLocale() {
        return locale;
    }

    public void setLocale(final LocaleProperties locale) {
        this.locale = locale;
    }

    public ManagementWebappProperties getMgmt() {
        return mgmt;
    }

    public void setMgmt(final ManagementWebappProperties mgmt) {
        this.mgmt = mgmt;
    }

    public WebflowProperties getWebflow() {
        return webflow;
    }

    public void setWebflow(final WebflowProperties webflow) {
        this.webflow = webflow;
    }

    public AuthenticationProperties getAuthn() {
        return authn;
    }

    public void setAuthn(final AuthenticationProperties authn) {
        this.authn = authn;
    }

    public GoogleMapsProperties getGoogleMaps() {
        return googleMaps;
    }

    public void setGoogleMaps(final GoogleMapsProperties googleMaps) {
        this.googleMaps = googleMaps;
    }

    public GoogleRecaptchaProperties getGoogleRecaptcha() {
        return googleRecaptcha;
    }

    public void setGoogleRecaptcha(final GoogleRecaptchaProperties googleRecaptcha) {
        this.googleRecaptcha = googleRecaptcha;
    }

    public SamlServiceProviderProperties getSamlSp() {
        return samlSp;
    }

    public void setSamlSp(final SamlServiceProviderProperties samlSp) {
        this.samlSp = samlSp;
    }

    public TwillioProperties getTwillio() {
        return twillio;
    }

    public void setTwillio(final TwillioProperties twillio) {
        this.twillio = twillio;
    }

    public TextMagicProperties getTextMagic() {
        return textMagic;
    }

    public void setTextMagic(final TextMagicProperties textMagic) {
        this.textMagic = textMagic;
    }

    public ScimProperties getScim() {
        return scim;
    }

    public void setScim(final ScimProperties scim) {
        this.scim = scim;
    }

    public ClickatellProperties getClickatell() {
        return clickatell;
    }

    public void setClickatell(final ClickatellProperties clickatell) {
        this.clickatell = clickatell;
    }

}
