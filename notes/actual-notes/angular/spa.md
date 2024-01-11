# Single Page Applications

Single Page Applications or (SPA's) are webapps that render on a single page in the browser

Aall of our Javascript, HTML, and CSS are loaded in and ready for the browser in one page load

During navigation, the browser never refreshes because you stay on the same page

We will use Angular to create our SPA's

The advantages of SPA's

-   Fast and responsive
-   Caching capability
-   Pleasant user experience across multiple platforms

Disadvantages

-   Don't perform well with SEO
-   Less secure against Cross-site scripting
-   The page may take longer to load initially

# Webpack

Webpack is a powerful static module bundler for Javascript applications that packages all modules in our application into a bundle and serves it to the browser

This means that all of our JS files and dependencies would be in a single file, all our HTML files would be in a single file, and so

This helps speed up the loading of our webpage, because instead of loading up several files, it just loads one

Webpack builds a dependency graph when it proccesses the application. It starts from a list of modules defined in its config file and recursively builds the dependency graph that includes every module of our application needs, then packages all of those modules into a small bundle that can be loaded by the browser
