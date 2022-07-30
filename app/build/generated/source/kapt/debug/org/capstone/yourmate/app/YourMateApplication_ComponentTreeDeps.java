package org.capstone.yourmate.app;

import dagger.hilt.internal.aggregatedroot.codegen._org_capstone_yourmate_app_YourMateApplication;
import dagger.hilt.internal.componenttreedeps.ComponentTreeDeps;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_components_ActivityComponent;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_components_ActivityRetainedComponent;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_components_FragmentComponent;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_components_ServiceComponent;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_components_ViewComponent;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_components_ViewModelComponent;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_components_ViewWithFragmentComponent;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_internal_builders_ActivityComponentBuilder;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_internal_builders_ActivityRetainedComponentBuilder;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_internal_builders_FragmentComponentBuilder;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_internal_builders_ServiceComponentBuilder;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_internal_builders_ViewComponentBuilder;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_internal_builders_ViewModelComponentBuilder;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_internal_builders_ViewWithFragmentComponentBuilder;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_components_SingletonComponent;
import hilt_aggregated_deps._dagger_hilt_android_internal_lifecycle_DefaultViewModelFactories_ActivityEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_lifecycle_DefaultViewModelFactories_FragmentEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_lifecycle_HiltViewModelFactory_ViewModelFactoriesEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_lifecycle_HiltWrapper_DefaultViewModelFactories_ActivityModule;
import hilt_aggregated_deps._dagger_hilt_android_internal_lifecycle_HiltWrapper_HiltViewModelFactory_ActivityCreatorEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_lifecycle_HiltWrapper_HiltViewModelFactory_ViewModelModule;
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_ActivityComponentManager_ActivityComponentBuilderEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_FragmentComponentManager_FragmentComponentBuilderEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedComponentBuilderEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedLifecycleEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_HiltWrapper_ActivityRetainedComponentManager_LifecycleModule;
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_ServiceComponentManager_ServiceComponentBuilderEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_ViewComponentManager_ViewComponentBuilderEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_ViewComponentManager_ViewWithFragmentComponentBuilderEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_modules_ApplicationContextModule;
import hilt_aggregated_deps._dagger_hilt_android_internal_modules_HiltWrapper_ActivityModule;
import hilt_aggregated_deps._org_capstone_yourmate_app_YourMateApplication_GeneratedInjector;
import hilt_aggregated_deps._org_capstone_yourmate_auth_login_LoginActivity_GeneratedInjector;
import hilt_aggregated_deps._org_capstone_yourmate_auth_register_RegisterActivity_GeneratedInjector;
import hilt_aggregated_deps._org_capstone_yourmate_chat_ChatActivity_GeneratedInjector;
import hilt_aggregated_deps._org_capstone_yourmate_di_hilt_DataModule;
import hilt_aggregated_deps._org_capstone_yourmate_di_hilt_DomainModule;
import hilt_aggregated_deps._org_capstone_yourmate_home_HomeActivity_GeneratedInjector;
import hilt_aggregated_deps._org_capstone_yourmate_home_ui_chat_ChatFragment_GeneratedInjector;
import hilt_aggregated_deps._org_capstone_yourmate_home_ui_contacts_ContactsFragment_GeneratedInjector;
import hilt_aggregated_deps._org_capstone_yourmate_home_ui_home_HomeFragment_GeneratedInjector;
import hilt_aggregated_deps._org_capstone_yourmate_home_ui_home_HomeViewModel_HiltModules_BindsModule;
import hilt_aggregated_deps._org_capstone_yourmate_home_ui_home_HomeViewModel_HiltModules_KeyModule;
import hilt_aggregated_deps._org_capstone_yourmate_home_ui_profile_ProfileFragment_GeneratedInjector;
import hilt_aggregated_deps._org_capstone_yourmate_settings_SettingsActivity_GeneratedInjector;
import hilt_aggregated_deps._org_capstone_yourmate_splash_screen_SplashScreenActivity_GeneratedInjector;
import hilt_aggregated_deps._org_capstone_yourmate_viewmodels_AuthViewModel_HiltModules_BindsModule;
import hilt_aggregated_deps._org_capstone_yourmate_viewmodels_AuthViewModel_HiltModules_KeyModule;
import hilt_aggregated_deps._org_capstone_yourmate_viewmodels_ChatViewModel_HiltModules_BindsModule;
import hilt_aggregated_deps._org_capstone_yourmate_viewmodels_ChatViewModel_HiltModules_KeyModule;
import hilt_aggregated_deps._org_capstone_yourmate_viewmodels_ContactsViewModel_HiltModules_BindsModule;
import hilt_aggregated_deps._org_capstone_yourmate_viewmodels_ContactsViewModel_HiltModules_KeyModule;

@ComponentTreeDeps(
    rootDeps = _org_capstone_yourmate_app_YourMateApplication.class,
    defineComponentDeps = {
        _dagger_hilt_android_components_ActivityComponent.class,
        _dagger_hilt_android_components_ActivityRetainedComponent.class,
        _dagger_hilt_android_components_FragmentComponent.class,
        _dagger_hilt_android_components_ServiceComponent.class,
        _dagger_hilt_android_components_ViewComponent.class,
        _dagger_hilt_android_components_ViewModelComponent.class,
        _dagger_hilt_android_components_ViewWithFragmentComponent.class,
        _dagger_hilt_android_internal_builders_ActivityComponentBuilder.class,
        _dagger_hilt_android_internal_builders_ActivityRetainedComponentBuilder.class,
        _dagger_hilt_android_internal_builders_FragmentComponentBuilder.class,
        _dagger_hilt_android_internal_builders_ServiceComponentBuilder.class,
        _dagger_hilt_android_internal_builders_ViewComponentBuilder.class,
        _dagger_hilt_android_internal_builders_ViewModelComponentBuilder.class,
        _dagger_hilt_android_internal_builders_ViewWithFragmentComponentBuilder.class,
        _dagger_hilt_components_SingletonComponent.class
    },
    aggregatedDeps = {
        _dagger_hilt_android_internal_lifecycle_DefaultViewModelFactories_ActivityEntryPoint.class,
        _dagger_hilt_android_internal_lifecycle_DefaultViewModelFactories_FragmentEntryPoint.class,
        _dagger_hilt_android_internal_lifecycle_HiltViewModelFactory_ViewModelFactoriesEntryPoint.class,
        _dagger_hilt_android_internal_lifecycle_HiltWrapper_DefaultViewModelFactories_ActivityModule.class,
        _dagger_hilt_android_internal_lifecycle_HiltWrapper_HiltViewModelFactory_ActivityCreatorEntryPoint.class,
        _dagger_hilt_android_internal_lifecycle_HiltWrapper_HiltViewModelFactory_ViewModelModule.class,
        _dagger_hilt_android_internal_managers_ActivityComponentManager_ActivityComponentBuilderEntryPoint.class,
        _dagger_hilt_android_internal_managers_FragmentComponentManager_FragmentComponentBuilderEntryPoint.class,
        _dagger_hilt_android_internal_managers_HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedComponentBuilderEntryPoint.class,
        _dagger_hilt_android_internal_managers_HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedLifecycleEntryPoint.class,
        _dagger_hilt_android_internal_managers_HiltWrapper_ActivityRetainedComponentManager_LifecycleModule.class,
        _dagger_hilt_android_internal_managers_ServiceComponentManager_ServiceComponentBuilderEntryPoint.class,
        _dagger_hilt_android_internal_managers_ViewComponentManager_ViewComponentBuilderEntryPoint.class,
        _dagger_hilt_android_internal_managers_ViewComponentManager_ViewWithFragmentComponentBuilderEntryPoint.class,
        _dagger_hilt_android_internal_modules_ApplicationContextModule.class,
        _dagger_hilt_android_internal_modules_HiltWrapper_ActivityModule.class,
        _org_capstone_yourmate_di_hilt_DataModule.class,
        _org_capstone_yourmate_di_hilt_DomainModule.class,
        _org_capstone_yourmate_app_YourMateApplication_GeneratedInjector.class,
        _org_capstone_yourmate_auth_login_LoginActivity_GeneratedInjector.class,
        _org_capstone_yourmate_auth_register_RegisterActivity_GeneratedInjector.class,
        _org_capstone_yourmate_chat_ChatActivity_GeneratedInjector.class,
        _org_capstone_yourmate_home_HomeActivity_GeneratedInjector.class,
        _org_capstone_yourmate_home_ui_chat_ChatFragment_GeneratedInjector.class,
        _org_capstone_yourmate_home_ui_contacts_ContactsFragment_GeneratedInjector.class,
        _org_capstone_yourmate_home_ui_home_HomeFragment_GeneratedInjector.class,
        _org_capstone_yourmate_home_ui_profile_ProfileFragment_GeneratedInjector.class,
        _org_capstone_yourmate_settings_SettingsActivity_GeneratedInjector.class,
        _org_capstone_yourmate_splash_screen_SplashScreenActivity_GeneratedInjector.class,
        _org_capstone_yourmate_home_ui_home_HomeViewModel_HiltModules_BindsModule.class,
        _org_capstone_yourmate_home_ui_home_HomeViewModel_HiltModules_KeyModule.class,
        _org_capstone_yourmate_viewmodels_AuthViewModel_HiltModules_BindsModule.class,
        _org_capstone_yourmate_viewmodels_AuthViewModel_HiltModules_KeyModule.class,
        _org_capstone_yourmate_viewmodels_ChatViewModel_HiltModules_BindsModule.class,
        _org_capstone_yourmate_viewmodels_ChatViewModel_HiltModules_KeyModule.class,
        _org_capstone_yourmate_viewmodels_ContactsViewModel_HiltModules_BindsModule.class,
        _org_capstone_yourmate_viewmodels_ContactsViewModel_HiltModules_KeyModule.class
    }
)
class YourMateApplication_ComponentTreeDeps {
}