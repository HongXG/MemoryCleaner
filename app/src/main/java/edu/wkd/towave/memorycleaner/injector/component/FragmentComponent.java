package edu.wkd.towave.memorycleaner.injector.component;

import dagger.Component;
import edu.wkd.towave.memorycleaner.injector.Fragment;
import edu.wkd.towave.memorycleaner.injector.module.FragmentModule;
import edu.wkd.towave.memorycleaner.ui.fragment.AppsFragment;
import edu.wkd.towave.memorycleaner.ui.fragment.CircularLoader;
import edu.wkd.towave.memorycleaner.ui.fragment.LineChart;

@Fragment
@Component(dependencies = { ActivityComponent.class },
           modules = { FragmentModule.class })
public interface FragmentComponent {
    void inject(CircularLoader fragment);
    void inject(LineChart fragment);
    void inject(AppsFragment fragment);
}
