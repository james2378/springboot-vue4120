<template>
	<div class="addEdit-block" style="width: 100%;">
		<el-form
			:style='{"padding":"30px","boxShadow":"0 2px 6px #ddd","borderRadius":"10px","background":"#ffffff"}'
			class="add-update-preview"
			ref="ruleForm"
			:model="ruleForm"
			:rules="rules"
			label-width="80px"
		>
			<template >
				<el-form-item :style='{"margin":"0 0 20px 0"}' class="select" v-if="type!='info'"  label="月份" prop="yuefen">
					<el-select :disabled="ro.yuefen" v-model="ruleForm.yuefen" placeholder="请选择月份" >
						<el-option
							v-for="(item,index) in yuefenOptions"
							v-bind:key="index"
							:label="item"
							:value="item">
						</el-option>
					</el-select>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 20px 0"}' v-else class="input" label="月份" prop="yuefen">
					<el-input v-model="ruleForm.yuefen"
						placeholder="月份" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 20px 0"}' class="select" v-if="type!='info'" label="工号" prop="gonghao">
					<el-select :disabled="ro.gonghao" @change="gonghaoChange" v-model="ruleForm.gonghao" placeholder="请选择工号">
						<el-option
							v-for="(item,index) in gonghaoOptions"
							v-bind:key="index"
							:label="item"
							:value="item">
						</el-option>
					</el-select>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 20px 0"}' class="input" v-else-if="ruleForm.gonghao" label="工号" prop="gonghao">
					<el-input v-model="ruleForm.gonghao" placeholder="工号" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 20px 0"}' class="input" v-if="type!='info'"  label="姓名" prop="xingming">
					<el-input v-model="ruleForm.xingming" placeholder="姓名" clearable  :readonly="ro.xingming"></el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 20px 0"}' v-else class="input" label="姓名" prop="xingming">
					<el-input v-model="ruleForm.xingming" placeholder="姓名" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 20px 0"}' class="input" v-if="type!='info'"  label="部门" prop="bumen">
					<el-input v-model="ruleForm.bumen" placeholder="部门" clearable  :readonly="ro.bumen"></el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 20px 0"}' v-else class="input" label="部门" prop="bumen">
					<el-input v-model="ruleForm.bumen" placeholder="部门" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 20px 0"}' class="input" v-if="type!='info'"  label="基本工资" prop="jibengongzi">
					<el-input v-model="ruleForm.jibengongzi" placeholder="基本工资" clearable  :readonly="ro.jibengongzi"></el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 20px 0"}' v-else class="input" label="基本工资" prop="jibengongzi">
					<el-input v-model="ruleForm.jibengongzi" placeholder="基本工资" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 20px 0"}' class="input" v-if="type!='info'"  label="加班工资" prop="jiabangongzi">
					<el-input v-model="ruleForm.jiabangongzi" placeholder="加班工资" clearable  :readonly="ro.jiabangongzi"></el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 20px 0"}' v-else class="input" label="加班工资" prop="jiabangongzi">
					<el-input v-model="ruleForm.jiabangongzi" placeholder="加班工资" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 20px 0"}' class="input" v-if="type!='info'"  label="绩效奖金" prop="jixiaojiangjin">
					<el-input v-model="ruleForm.jixiaojiangjin" placeholder="绩效奖金" clearable  :readonly="ro.jixiaojiangjin"></el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 20px 0"}' v-else class="input" label="绩效奖金" prop="jixiaojiangjin">
					<el-input v-model="ruleForm.jixiaojiangjin" placeholder="绩效奖金" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 20px 0"}' class="input" v-if="type!='info'"  label="其他补助" prop="qitabuzhu">
					<el-input v-model="ruleForm.qitabuzhu" placeholder="其他补助" clearable  :readonly="ro.qitabuzhu"></el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 20px 0"}' v-else class="input" label="其他补助" prop="qitabuzhu">
					<el-input v-model="ruleForm.qitabuzhu" placeholder="其他补助" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 20px 0"}' class="input" v-if="type!='info'"  label="扣款金额" prop="koukuanjine">
					<el-input v-model="ruleForm.koukuanjine" placeholder="扣款金额" clearable  :readonly="ro.koukuanjine"></el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 20px 0"}' v-else class="input" label="扣款金额" prop="koukuanjine">
					<el-input v-model="ruleForm.koukuanjine" placeholder="扣款金额" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 20px 0"}' class="input" v-if="type!='info'" label="实发工资" prop="shifagongzi">
					<el-input v-model="shifagongzi" placeholder="实发工资" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 20px 0"}' class="input" v-else-if="ruleForm.shifagongzi" label="实发工资" prop="shifagongzi">
					<el-input v-model="ruleForm.shifagongzi" placeholder="实发工资" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 20px 0"}' class="date" v-if="type!='info'" label="登记日期" prop="dengjiriqi">
					<el-date-picker
						format="yyyy 年 MM 月 dd 日"
						value-format="yyyy-MM-dd"
						v-model="ruleForm.dengjiriqi" 
						type="date"
						:readonly="ro.dengjiriqi"
						placeholder="登记日期"
					></el-date-picker> 
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 20px 0"}' class="input" v-else-if="ruleForm.dengjiriqi" label="登记日期" prop="dengjiriqi">
					<el-input v-model="ruleForm.dengjiriqi" placeholder="登记日期" readonly></el-input>
				</el-form-item>
			</template>
				<el-form-item :style='{"margin":"0 0 20px 0"}' class="textarea" v-if="type!='info'" label="扣款原因" prop="koukuanyuanyin">
					<el-input
					  style="min-width: 200px; max-width: 600px;"
					  type="textarea"
					  :rows="8"
					  placeholder="扣款原因"
					  v-model="ruleForm.koukuanyuanyin" >
					</el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 20px 0"}' v-else-if="ruleForm.koukuanyuanyin" label="扣款原因" prop="koukuanyuanyin">
					<span :style='{"border":"1px solid #5497f2","padding":"0 40px","color":"#bbbbbb","borderRadius":"20px 40px","display":"inline-block","fontSize":"14px","lineHeight":"40px","fontWeight":"500"}'>{{ruleForm.koukuanyuanyin}}</span>
				</el-form-item>
			<el-form-item :style='{"padding":"0","margin":"30px 0 0 0"}' class="btn">
				<el-button :style='{"border":"0","cursor":"pointer","padding":"0","margin":"0 30px 0 0","outline":"none","color":"rgba(255, 255, 255, 1)","borderRadius":"20px 40px","background":"#5497f2","width":"128px","lineHeight":"40px","fontSize":"14px","height":"40px"}'  v-if="type!='info'" type="primary" class="btn-success" @click="onSubmit">提交</el-button>
				<el-button :style='{"border":"1px solid rgba(64, 158, 255, 1)","cursor":"pointer","padding":"0","margin":"0","outline":"none","color":"rgba(64, 158, 255, 1)","borderRadius":"20px 40px","background":"rgba(255, 255, 255, 1)","width":"128px","lineHeight":"40px","fontSize":"14px","height":"40px"}' v-if="type!='info'" class="btn-close" @click="back()">取消</el-button>
				<el-button :style='{"border":"1px solid rgba(64, 158, 255, 1)","cursor":"pointer","padding":"0","margin":"0","outline":"none","color":"rgba(64, 158, 255, 1)","borderRadius":"20px 40px","background":"rgba(255, 255, 255, 1)","width":"128px","lineHeight":"40px","fontSize":"14px","height":"40px"}' v-if="type=='info'" class="btn-close" @click="back()">返回</el-button>
			</el-form-item>
		</el-form>
    

  </div>
</template>
<script>
// 数字，邮件，手机，url，身份证校验
import { isNumber,isIntNumer,isEmail,isPhone, isMobile,isURL,checkIdCard } from "@/utils/validate";
export default {
	data() {
		let self = this
		var validateIdCard = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!checkIdCard(value)) {
				callback(new Error("请输入正确的身份证号码"));
			} else {
				callback();
			}
		};
		var validateUrl = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isURL(value)) {
				callback(new Error("请输入正确的URL地址"));
			} else {
				callback();
			}
		};
		var validateMobile = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isMobile(value)) {
				callback(new Error("请输入正确的手机号码"));
			} else {
				callback();
			}
		};
		var validatePhone = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isPhone(value)) {
				callback(new Error("请输入正确的电话号码"));
			} else {
				callback();
			}
		};
		var validateEmail = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isEmail(value)) {
				callback(new Error("请输入正确的邮箱地址"));
			} else {
				callback();
			}
		};
		var validateNumber = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isNumber(value)) {
				callback(new Error("请输入数字"));
			} else {
				callback();
			}
		};
		var validateIntNumber = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isIntNumer(value)) {
				callback(new Error("请输入整数"));
			} else {
				callback();
			}
		};
		return {
			id: '',
			type: '',
			
			
			ro:{
				yuefen : false,
				gonghao : false,
				xingming : false,
				bumen : false,
				jibengongzi : false,
				jiabangongzi : false,
				jixiaojiangjin : false,
				qitabuzhu : false,
				koukuanjine : false,
				koukuanyuanyin : false,
				shifagongzi : false,
				dengjiriqi : false,
			},
			
			
			ruleForm: {
				yuefen: '',
				gonghao: '',
				xingming: '',
				bumen: '',
				jibengongzi: '',
				jiabangongzi: '',
				jixiaojiangjin: '',
				qitabuzhu: '',
				koukuanjine: '',
				koukuanyuanyin: '',
				shifagongzi: '',
				dengjiriqi: '',
			},
		
			yuefenOptions: [],
			gonghaoOptions: [],
			
			rules: {
				yuefen: [
				],
				gonghao: [
				],
				xingming: [
				],
				bumen: [
				],
				jibengongzi: [
					{ validator: validateNumber, trigger: 'blur' },
				],
				jiabangongzi: [
					{ validator: validateNumber, trigger: 'blur' },
				],
				jixiaojiangjin: [
					{ validator: validateNumber, trigger: 'blur' },
				],
				qitabuzhu: [
					{ validator: validateNumber, trigger: 'blur' },
				],
				koukuanjine: [
					{ validator: validateNumber, trigger: 'blur' },
				],
				koukuanyuanyin: [
				],
				shifagongzi: [
					{ validator: validateNumber, trigger: 'blur' },
				],
				dengjiriqi: [
				],
			}
		};
	},
	props: ["parent"],
	computed: {
		shifagongzi: {
			get: function () {
				return 0+parseFloat(this.ruleForm.jibengongzi==""?0:this.ruleForm.jibengongzi)+parseFloat(this.ruleForm.jiabangongzi==""?0:this.ruleForm.jiabangongzi)+parseFloat(this.ruleForm.jixiaojiangjin==""?0:this.ruleForm.jixiaojiangjin)+parseFloat(this.ruleForm.qitabuzhu==""?0:this.ruleForm.qitabuzhu)-parseFloat(this.ruleForm.koukuanjine==""?0:this.ruleForm.koukuanjine) || 0
			}
		},



	},
	created() {
		this.ruleForm.dengjiriqi = this.getCurDate()
	},
	methods: {
		
		// 下载
		download(file){
			window.open(`${file}`)
		},
		// 初始化
		init(id,type) {
			if (id) {
				this.id = id;
				this.type = type;
			}
			if(this.type=='info'||this.type=='else'){
				this.info(id);
			}else if(this.type=='logistics'){
				this.logistics=false;
				this.info(id);
			}else if(this.type=='cross'){
				var obj = this.$storage.getObj('crossObj');
				for (var o in obj){
						if(o=='yuefen'){
							this.ruleForm.yuefen = obj[o];
							this.ro.yuefen = true;
							continue;
						}
						if(o=='gonghao'){
							this.ruleForm.gonghao = obj[o];
							this.ro.gonghao = true;
							continue;
						}
						if(o=='xingming'){
							this.ruleForm.xingming = obj[o];
							this.ro.xingming = true;
							continue;
						}
						if(o=='bumen'){
							this.ruleForm.bumen = obj[o];
							this.ro.bumen = true;
							continue;
						}
						if(o=='jibengongzi'){
							this.ruleForm.jibengongzi = obj[o];
							this.ro.jibengongzi = true;
							continue;
						}
						if(o=='jiabangongzi'){
							this.ruleForm.jiabangongzi = obj[o];
							this.ro.jiabangongzi = true;
							continue;
						}
						if(o=='jixiaojiangjin'){
							this.ruleForm.jixiaojiangjin = obj[o];
							this.ro.jixiaojiangjin = true;
							continue;
						}
						if(o=='qitabuzhu'){
							this.ruleForm.qitabuzhu = obj[o];
							this.ro.qitabuzhu = true;
							continue;
						}
						if(o=='koukuanjine'){
							this.ruleForm.koukuanjine = obj[o];
							this.ro.koukuanjine = true;
							continue;
						}
						if(o=='koukuanyuanyin'){
							this.ruleForm.koukuanyuanyin = obj[o];
							this.ro.koukuanyuanyin = true;
							continue;
						}
						if(o=='shifagongzi'){
							this.ruleForm.shifagongzi = obj[o];
							this.ro.shifagongzi = true;
							continue;
						}
						if(o=='dengjiriqi'){
							this.ruleForm.dengjiriqi = obj[o];
							this.ro.dengjiriqi = true;
							continue;
						}
				}
				












			}
			
			
			// 获取用户信息
			this.$http({
				url: `${this.$storage.get('sessionTable')}/session`,
				method: "get"
			}).then(({ data }) => {
				if (data && data.code === 0) {
					
					var json = data.data;
				} else {
					this.$message.error(data.msg);
				}
			});
			
            this.yuefenOptions = "一月,二月,三月,四月,五月,六月,七月,八月,九月,十月,十一月,十二月".split(',')
            this.$http({
				url: `option/yuangong/gonghao`,
				method: "get"
            }).then(({ data }) => {
				if (data && data.code === 0) {
					this.gonghaoOptions = data.data;
				} else {
					this.$message.error(data.msg);
				}
            });
			
		},
			// 下二随
			gonghaoChange () {
				this.$http({
					url: `follow/yuangong/gonghao?columnValue=`+ this.ruleForm.gonghao,
					method: "get"
				}).then(({ data }) => {
					if (data && data.code === 0) {
						if(data.data.xingming){
							this.ruleForm.xingming = data.data.xingming
						}
						if(data.data.bumen){
							this.ruleForm.bumen = data.data.bumen
						}
					} else {
						this.$message.error(data.msg);
					}
				});
			},
    // 多级联动参数

    info(id) {
      this.$http({
        url: `yuangonggongzi/info/${id}`,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
        this.ruleForm = data.data;
	//解决前台上传图片后台不显示的问题
	let reg=new RegExp('../../../upload','g')//g代表全部
        } else {
          this.$message.error(data.msg);
        }
      });
    },


    // 提交
    onSubmit() {
        this.ruleForm.shifagongzi = this.shifagongzi

























var objcross = this.$storage.getObj('crossObj');

      //更新跨表属性
       var crossuserid;
       var crossrefid;
       var crossoptnum;
       if(this.type=='cross'){
                var statusColumnName = this.$storage.get('statusColumnName');
                var statusColumnValue = this.$storage.get('statusColumnValue');
                if(statusColumnName!='') {
                        var obj = this.$storage.getObj('crossObj');
                       if(statusColumnName && !statusColumnName.startsWith("[")) {
                               for (var o in obj){
                                 if(o==statusColumnName){
                                   obj[o] = statusColumnValue;
                                 }
                               }
                               var table = this.$storage.get('crossTable');
                             this.$http({
                                 url: `${table}/update`,
                                 method: "post",
                                 data: obj
                               }).then(({ data }) => {});
                       } else {
                               crossuserid=this.$storage.get('userid');
                               crossrefid=obj['id'];
                               crossoptnum=this.$storage.get('statusColumnName');
                               crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
                        }
                }
        }
       this.$refs["ruleForm"].validate(valid => {
         if (valid) {
		 if(crossrefid && crossuserid) {
			 this.ruleForm.crossuserid = crossuserid;
			 this.ruleForm.crossrefid = crossrefid;
			let params = { 
				page: 1, 
				limit: 10, 
				crossuserid:this.ruleForm.crossuserid,
				crossrefid:this.ruleForm.crossrefid,
			} 
			this.$http({ 
				url: "yuangonggongzi/page", 
				method: "get", 
				params: params 
			}).then(({ 
				data 
			}) => { 
				if (data && data.code === 0) { 
				       if(data.data.total>=crossoptnum) {
					     this.$message.error(this.$storage.get('tips'));
					       return false;
				       } else {
					 this.$http({
					   url: `yuangonggongzi/${!this.ruleForm.id ? "save" : "update"}`,
					   method: "post",
					   data: this.ruleForm
					 }).then(({ data }) => {
					   if (data && data.code === 0) {
					     this.$message({
					       message: "操作成功",
					       type: "success",
					       duration: 1500,
					       onClose: () => {
						 this.parent.showFlag = true;
						 this.parent.addOrUpdateFlag = false;
						 this.parent.yuangonggongziCrossAddOrUpdateFlag = false;
						 this.parent.search();
						 this.parent.contentStyleChange();
					       }
					     });
					   } else {
					     this.$message.error(data.msg);
					   }
					 });

				       }
				} else { 
				} 
			});
		 } else {
			 this.$http({
			   url: `yuangonggongzi/${!this.ruleForm.id ? "save" : "update"}`,
			   method: "post",
			   data: this.ruleForm
			 }).then(({ data }) => {
			   if (data && data.code === 0) {
			     this.$message({
			       message: "操作成功",
			       type: "success",
			       duration: 1500,
			       onClose: () => {
				 this.parent.showFlag = true;
				 this.parent.addOrUpdateFlag = false;
				 this.parent.yuangonggongziCrossAddOrUpdateFlag = false;
				 this.parent.search();
				 this.parent.contentStyleChange();
			       }
			     });
			   } else {
			     this.$message.error(data.msg);
			   }
			 });
		 }
         }
       });
    },
    // 获取uuid
    getUUID () {
      return new Date().getTime();
    },
    // 返回
    back() {
      this.parent.showFlag = true;
      this.parent.addOrUpdateFlag = false;
      this.parent.yuangonggongziCrossAddOrUpdateFlag = false;
      this.parent.contentStyleChange();
    },
  }
};
</script>
<style lang="scss" scoped>
	.amap-wrapper {
		width: 100%;
		height: 500px;
	}
	
	.search-box {
		position: absolute;
	}
	
	.el-date-editor.el-input {
		width: auto;
	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__label {
	  	  padding: 0 10px 0 0;
	  	  color: #666;
	  	  font-weight: 500;
	  	  width: 80px;
	  	  font-size: 14px;
	  	  line-height: 40px;
	  	  text-align: right;
	  	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__content {
	  margin-left: 80px;
	}
	
	.add-update-preview .el-input /deep/ .el-input__inner {
	  	  border: 1px solid #5497f2;
	  	  border-radius: 20px 40px;
	  	  padding: 0 12px;
	  	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  	  outline: none;
	  	  color: #bbbbbb;
	  	  width: 400px;
	  	  font-size: 14px;
	  	  height: 40px;
	  	}
	
	.add-update-preview .el-select /deep/ .el-input__inner {
	  	  border: 1px solid #5497f2;
	  	  border-radius: 20px 40px;
	  	  padding: 0 10px;
	  	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  	  outline: none;
	  	  color: #bbb;
	  	  width: 200px;
	  	  font-size: 14px;
	  	  height: 40px;
	  	}
	
	.add-update-preview .el-date-editor /deep/ .el-input__inner {
	  	  border: 1px solid #5497f2;
	  	  border-radius: 20px 40px;
	  	  padding: 0 10px 0 30px;
	  	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  	  outline: none;
	  	  color: #bbb;
	  	  width: 200px;
	  	  font-size: 14px;
	  	  height: 40px;
	  	}
	
	.add-update-preview /deep/ .el-upload--picture-card {
		background: transparent;
		border: 0;
		border-radius: 0;
		width: auto;
		height: auto;
		line-height: initial;
		vertical-align: middle;
	}
	
	.add-update-preview /deep/ .upload .upload-img {
	  	  border: 1px dashed rgba(64, 158, 255, 1);
	  	  cursor: pointer;
	  	  border-radius: 20px 40px;
	  	  color: rgba(64, 158, 255, 1);
	  	  width: 160px;
	  	  font-size: 32px;
	  	  line-height: 100px;
	  	  text-align: center;
	  	  height: 100px;
	  	}
	
	.add-update-preview /deep/ .el-upload-list .el-upload-list__item {
	  	  border: 1px dashed rgba(64, 158, 255, 1);
	  	  cursor: pointer;
	  	  border-radius: 20px 40px;
	  	  color: rgba(64, 158, 255, 1);
	  	  width: 160px;
	  	  font-size: 32px;
	  	  line-height: 100px;
	  	  text-align: center;
	  	  height: 100px;
	  	}
	
	.add-update-preview /deep/ .el-upload .el-icon-plus {
	  	  border: 1px dashed rgba(64, 158, 255, 1);
	  	  cursor: pointer;
	  	  border-radius: 20px 40px;
	  	  color: rgba(64, 158, 255, 1);
	  	  width: 160px;
	  	  font-size: 32px;
	  	  line-height: 100px;
	  	  text-align: center;
	  	  height: 100px;
	  	}
	
	.add-update-preview .el-textarea /deep/ .el-textarea__inner {
	  	  border: 1px solid #5497f2;
	  	  border-radius: 20px 40px;
	  	  padding: 12px;
	  	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  	  outline: none;
	  	  color: #bbb;
	  	  width: 400px;
	  	  font-size: 14px;
	  	  height: auto;
	  	}
</style>
