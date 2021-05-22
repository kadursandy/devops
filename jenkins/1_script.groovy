// Cretae a Free style project
def svr = Jenkins.instance;
def job = svr.getJob("TEST");
def sched = job.scheduleBuild2(0);

sched.get();


// Under a project goto => Build -> Advanced 
// target=Test
import jenkins.model.Jenkins
// println binding.variables["target"]
def target = binding.variables["target"]
// def target = build.buildVariableResolver.resolve("target")
def svr = Jenkins.instance;
def job = svr.getJob(target);
def sched = job.scheduleBuild2(0);
sched.get();

// Additional classpath
