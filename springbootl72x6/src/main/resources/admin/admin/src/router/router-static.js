import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import bumenxinxi from '@/views/modules/bumenxinxi/list'
    import yuangong from '@/views/modules/yuangong/list'
    import yuangongqingjia from '@/views/modules/yuangongqingjia/list'
    import yuangonggongzi from '@/views/modules/yuangonggongzi/list'
    import xiapairenwu from '@/views/modules/xiapairenwu/list'
    import tongzhigonggao from '@/views/modules/tongzhigonggao/list'
    import yuangongdangan from '@/views/modules/yuangongdangan/list'
    import yuangongpingjia from '@/views/modules/yuangongpingjia/list'
    import yuangongdaka from '@/views/modules/yuangongdaka/list'
    import wanchengrenwu from '@/views/modules/wanchengrenwu/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/bumenxinxi',
        name: '部门信息',
        component: bumenxinxi
      }
      ,{
	path: '/yuangong',
        name: '员工',
        component: yuangong
      }
      ,{
	path: '/yuangongqingjia',
        name: '员工请假',
        component: yuangongqingjia
      }
      ,{
	path: '/yuangonggongzi',
        name: '员工工资',
        component: yuangonggongzi
      }
      ,{
	path: '/xiapairenwu',
        name: '下派任务',
        component: xiapairenwu
      }
      ,{
	path: '/tongzhigonggao',
        name: '通知公告',
        component: tongzhigonggao
      }
      ,{
	path: '/yuangongdangan',
        name: '员工档案',
        component: yuangongdangan
      }
      ,{
	path: '/yuangongpingjia',
        name: '员工评价',
        component: yuangongpingjia
      }
      ,{
	path: '/yuangongdaka',
        name: '员工打卡',
        component: yuangongdaka
      }
      ,{
	path: '/wanchengrenwu',
        name: '完成任务',
        component: wanchengrenwu
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})
const originalPush = VueRouter.prototype.push
//修改原型对象中的push方法
VueRouter.prototype.push = function push(location) {
   return originalPush.call(this, location).catch(err => err)
}
export default router;
