const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootl72x6/",
            name: "springbootl72x6",
            // 退出到首页链接
            indexUrl: ''
        };
    },
    getProjectName(){
        return {
            projectName: "springboot+vue办公管理系统"
        } 
    }
}
export default base
